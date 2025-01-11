package com.samsung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//class TestLargest {
//
//    @Test
//    void testSimple() {
//        // 단순 테스트
//        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
//    }
//
//    @Test
//    void testOrder() {
//        // 배열 순서에 따른 테스트
//        assertEquals(9, Largest.largest(new int[]{9, 8, 7}));
//        assertEquals(9, Largest.largest(new int[]{7, 9, 8}));
//        assertEquals(9, Largest.largest(new int[]{9, 7, 9, 8}));
//        assertEquals(1, Largest.largest(new int[]{1}));
//    }
//}


class TestLargest {

    @Test
    void testSimple() {
        // 단순 테스트
        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
    }

    @Test
    void testOrder() {
        // 배열 순서에 따른 테스트
        assertEquals(9, Largest.largest(new int[]{7, 9, 8}));
        assertEquals(9, Largest.largest(new int[]{9, 8, 7}));
        assertEquals(9, Largest.largest(new int[]{9, 7, 9, 8}));
        assertEquals(1, Largest.largest(new int[]{1}));
        assertEquals(-7, Largest.largest(new int[]{-9, -8, -7}));
    }
}