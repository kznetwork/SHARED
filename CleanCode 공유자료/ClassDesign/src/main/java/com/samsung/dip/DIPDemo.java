package com.samsung.dip;

// 추상화: MessageService
interface MessageService {
    void sendMessage(String message, String recipient);
}

// 구체적인 구현 1: Email 서비스
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("이메일을 " + recipient + "에게 전송: " + message);
    }
}

// 구체적인 구현 2: SMS 서비스
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("SMS를 " + recipient + "에게 전송: " + message);
    }
}

// 상위 모듈: Notification
class Notification {
    private final MessageService messageService;

    // 의존성 주입 (생성자 주입)
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}

// 메인 클래스 - DIP 데모
public class DIPDemo {
    public static void main(String[] args) {
        // EmailService를 사용하는 경우
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.notifyUser("이메일로 전송된 메시지입니다!", "john@example.com");

        // SMSService를 사용하는 경우
        MessageService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.notifyUser("SMS로 전송된 메시지입니다!", "010-1234-5678");
    }
}

