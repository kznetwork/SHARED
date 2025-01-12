package com.samsung.testdouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {

    @Test
    public void getDummy_더미객체() {
        // User 인터페이스의 가짜 구현 객체 인 Dummy 객체를 사용
        User user = new Dummy();

    }
}
