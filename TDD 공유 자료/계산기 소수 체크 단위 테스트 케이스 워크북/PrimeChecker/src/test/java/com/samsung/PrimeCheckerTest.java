package com.samsung;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void testNegativeNumber() {
        assertEquals("Invalid: Negative number", PrimeChecker.checkPrime("-1"));
    }

    @Test
    void testZero() {
        assertEquals("No", PrimeChecker.checkPrime("0"));
    }

    @Test
    void testPrimeNumber() {
        assertEquals("Yes", PrimeChecker.checkPrime("3"));
    }

    @Test
    void testBoundaryNumber1000() {
        assertEquals("No", PrimeChecker.checkPrime("1000"));
    }

    @Test
    void testOutOfRangeNumber() {
        assertEquals("Invalid: Out of range", PrimeChecker.checkPrime("1001"));
    }

    @Test
    void testNonPrimeNumber() {
        assertEquals("No", PrimeChecker.checkPrime("27"));
    }

    @Test
    void testNonNumericInput() {
        assertEquals("Invalid: Non-numeric input", PrimeChecker.checkPrime("r"));
    }

    @Test
    void testBlankInput() {
        assertEquals("Invalid: Blank input", PrimeChecker.checkPrime(" "));
    }
}