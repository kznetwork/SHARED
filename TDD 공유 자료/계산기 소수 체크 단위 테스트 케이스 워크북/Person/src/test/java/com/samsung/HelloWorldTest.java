//package com.samsung;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HelloTest {
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("BeforeAll!!!!!");
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        System.out.println("BeforeEach!!!!!");
//    }
//
//    @Test
//    @DisplayName("Smith 출력확인")
//    void firstTest() {
//        Person john = new Person("John", "Smith");
//
//        String result = john.getFirstName();
//        assertEquals("Smith", result);
//        assertTrue(john.getFirstName().startsWith("S"));
//        System.out.println("firstTest");
//    }
//
//    @Test
//    @DisplayName("GilDong 출력확인")
//    void firstTest1() {
//        Person john = new Person("John", "GilDong");
//
//        String result = john.getFirstName();
//        assertEquals("GilDong", result);
//        System.out.println("firstTest1");
//    }
//
//    @Test
//    @DisplayName("John 출력확인")
//    void firstTest3() {
//        Person john = new Person("John", "GilDong");
//
//        String result = john.getLastName();
//        assertEquals("John", result);
//        System.out.println("firstTest3");
//    }
//
//    @Test
//    @DisplayName("Hong 출력확인")
//    void firstTest4() {
//        Person john = new Person("Hong", "GilDong");
//
//        String result = john.getLastName();
//        assertEquals("Hong", result);
//        System.out.println("firstTest4");
//    }
//
//    @Test
//    @DisplayName("setFirstName 확인")
//    void firstTest5() {
//        Person john = new Person();
//
//        john.setFirstName("Smith");
//        String result = john.getFirstName();
//        assertEquals("Smith", result);
//        System.out.println("firstTest5");
//    }
//}
