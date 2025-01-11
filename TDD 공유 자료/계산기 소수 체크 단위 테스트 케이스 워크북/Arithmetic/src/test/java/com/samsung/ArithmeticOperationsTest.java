package com.samsung;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticOperationsTest {

    @Test
    void testAddition() {
        ArithmeticOperations ao=new ArithmeticOperations();
        assertEquals(6,ao.addition(4, 2));
    }

    @Test
    void testSubtraction() {
        ArithmeticOperations ao=new ArithmeticOperations();
        assertEquals(2,ao.subtraction(4, 2));
    }

    @Test
    void testMultiplication() {
        ArithmeticOperations ao=new ArithmeticOperations();
        assertEquals(8,ao.multiplication(4, 2));
    }

    @Test
    void testDivision() {
        ArithmeticOperations ao=new ArithmeticOperations();
        assertEquals(2,ao.division(4, 2));
    }

}