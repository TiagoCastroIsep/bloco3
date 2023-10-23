package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex16Test {
    @Test
    public void shouldReturnNumberIsPerfect() {
        int number = 6;
        int expected = 0;
        assertEquals(expected, PL03Ex16.numberClassification(number));
    }

    @Test
    public void shouldReturnNumberIsAbundant() {
        int number = 12;
        int expected = 1;
        assertEquals(expected, PL03Ex16.numberClassification(number));
    }

    @Test
    public void shouldReturnNumberIsReduced() {
        int number = 9;
        int expected = -1;
        assertEquals(expected, PL03Ex16.numberClassification(number));
    }

    @Test
    public void shouldReturnCodeForInvalidNumberWhenItsLessOrEqualsZero() {
        int number = 0;
        int expected = 2;
        assertEquals(expected, PL03Ex16.numberClassification(number));
    }
}