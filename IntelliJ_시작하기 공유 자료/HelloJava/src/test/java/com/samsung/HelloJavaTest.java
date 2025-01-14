package com.samsung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJavaTest {

    @Test
    void getHelloJavaTest() {
        assertEquals("Hello, Java!", new HelloJava().getHelloJava());
    }
}