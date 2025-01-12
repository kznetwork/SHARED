//import com.samsung.dto.UserDTO;
//
//public class Main {
//    public static void main(String[] args) {
//        // UserDTO 객체 생성
//        UserDTO userDTO = new UserDTO(1, "John Doe", "john@example.com");
//        System.out.println(userDTO); // UserDTO{id=1, name='John Doe', email='john@example.com'}
//
//        // DTO는 Mutable (값 변경 가능)
//        userDTO.setName("Jane Doe");
//        System.out.println(userDTO); // UserDTO{id=1, name='Jane Doe', email='john@example.com'}
//    }
//}

import com.samsung.vo.EmailVO;

public class Main {
    public static void main(String[] args) {
        // VO 객체 생성
        EmailVO email1 = new EmailVO("john@example.com");
        EmailVO email2 = new EmailVO("john@example.com");

        // VO 출력
        System.out.println(email1); // EmailVO{email='john@example.com'}

        // VO는 Immutable (값 변경 불가)
        // email1.email = "new@example.com"; // 이 코드는 컴파일 에러 발생

        // VO는 값 기반 동등성
        System.out.println(email1.equals(email2)); // true
    }
}

