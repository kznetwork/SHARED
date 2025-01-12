package com.samsung;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(OrderTestExtension.class) // Custom extension example
public class ExtensionTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll 실행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll 실행");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("@BeforeEach 실행");
    }

    @AfterEach
    void afterEach() {
        System.out.println("@AfterEach 실행");
    }

    @Test
    @DisplayName("테스트 1번 실행")
    void test10() {
        System.out.println("test10 실행");
    }

    @Test
    @DisplayName("테스트 2번 실행")
    void test20() {
        System.out.println("test20 실행");
    }

    @Test
    @DisplayName("테스트 3번 실행")
    void test30() {
        System.out.println("test30 실행");
    }
}

