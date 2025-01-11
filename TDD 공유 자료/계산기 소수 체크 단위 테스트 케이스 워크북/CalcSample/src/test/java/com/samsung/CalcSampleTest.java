package com.samsung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSampleTest {

    @Test
    void plus() {
        // Test Case 1
        int result = CalcSample.sum(1, 2);
        assertEquals(3, result, "1 + 2 should equal 3");

        // Test Case 2
        assertEquals(5, CalcSample.sum(4, 1), "4 + 1 should equal 5");
    }
}

