package com.samsung;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTest {

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"hong", "kim", "park"})
    void printName(String name) {
        System.out.println(name);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @EnumSource(DayOfWeek.class)
    void printDayOfWeek(DayOfWeek day) {
        System.out.println(day);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @EnumSource(value = DayOfWeek.class , names = {"MONDAY", "WEDNESDAY", "FRIDAY"})
    void printDayOfWeek2(DayOfWeek day) {
        System.out.println(day);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource({"apple,1", "banana,2", "'lemon, lime',0xF1"})
    void testWithCsvSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    @org.junit.jupiter.params.ParameterizedTest(name = "{index} => actual = {0}, expected = {1}")
    @EnumSource(value = DayOfWeek.class , names = {"SATURDAY", "MONDAY", "SUNDAY"})
    void testIsWeekend(DayOfWeek day) {
        System.out.println(day);
        assertTrue(day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY, day + "는 휴일이 아닙니다.");
    }

    @org.junit.jupiter.params.ParameterizedTest
    @EnumSource(value = DayOfWeek.class , names = {"SATURDAY", "MONDAY", "SUNDAY"})
    void testIsWeekend1(DayOfWeek day) {
        System.out.println(day);
        assertTrue(day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY);
    }

}
