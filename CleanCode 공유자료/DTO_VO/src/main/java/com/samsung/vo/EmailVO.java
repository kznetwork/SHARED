package com.samsung.vo;

import java.util.Objects;

public class EmailVO {
    private final String email;

    // 생성자에서 유효성 검증
    public EmailVO(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("유효하지 않은 이메일 주소입니다.");
        }
        this.email = email;
    }

    // Getter
    public String getEmail() {
        return email;
    }

    // 값 동등성 비교
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailVO emailVO = (EmailVO) o;
        return Objects.equals(email, emailVO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "EmailVO{email='" + email + "'}";
    }
}
