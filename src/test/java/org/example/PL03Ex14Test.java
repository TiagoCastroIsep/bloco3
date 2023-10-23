package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex14Test {
    @Test
    public void shouldReturnNumberValidated() {
        int number = 32222222;
        int expected = 1;
        assertEquals(expected, PL03Ex14.getIdentityNumberValidation(number));
    }

    @Test
    public void shouldReturnNumberNotValidatedDueToNotBeMultipleOf11() {
        int number = 14516456;
        int expected = -1;
        assertEquals(expected, PL03Ex14.getIdentityNumberValidation(number));
    }

    @Test
    public void shouldReturnNumberNotValidatedDueToNotBeBiggerThanZero() {
        int number = 0;
        int expected = -1;
        assertEquals(expected, PL03Ex14.getIdentityNumberValidation(number));
    }

    @Test
    public void shouldReturnNumberNotValidatedDueToNotHavingMoreThan8Digits() {
        int number = 322222221;
        int expected = -1;
        assertEquals(expected, PL03Ex14.getIdentityNumberValidation(number));
    }

}