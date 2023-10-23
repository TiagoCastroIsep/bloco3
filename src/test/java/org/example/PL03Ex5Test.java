package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex5Test {
    @Test
    public void shouldReturnTheNumberIsPalindrome() {
        long number = 1234321L;
        assertTrue(PL03Ex5.checkCompleteNumberIsPalindrome(number));
    }

    /** ISTO ESTÁ MAL!!! 22 é CAPICUA **/
    @Test
    public void shouldReturnTheNumberIsNotPalindrome() {
        long number = 1234322L;
        assertFalse(PL03Ex5.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnFalseIfNumberIsLessOrEqualsZero() {
        long number = 0L;
        assertFalse(PL03Ex5.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnIsNotPalindromeForNumberLessOrEqualsZero() {
        long number = 0L;
        assertFalse(PL03Ex5.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnTheNumberIsAmstrong() {
        long number = 371L;
        assertTrue(PL03Ex5.checkAmstrongNumber(number));
    }

    @Test
    public void shouldReturnTheNumberIsNotAmstrong() {
        long number = 373L;
        assertFalse(PL03Ex5.checkAmstrongNumber(number));
    }

    /** NOT REQUESTED for this exercise **/
    @Test
    public void shouldReturnTheFirstIsPalindromeMiddle() {
        long number = 89711234321358L;
        long[] expected = new long[] { 1, 1 };
        assertArrayEquals(expected, PL03Ex5.checkFirstPalindromeFoundInNumber(number));
    }

    @Test
    public void shouldReturnTheFirstIsPalindromeOnTheExtremeLeft() {
        long number = 12343218971358L;
        long[] expected = new long[] {3, 4, 3};
        assertArrayEquals(expected, PL03Ex5.checkFirstPalindromeFoundInNumber(number));
    }

    @Test
    public void shouldReturnTheFirstIsPalindromeOnTheExtremeRight() {
        long number = 123718971358343L;
        long[] expected = new long[] {3, 4, 3};
        assertArrayEquals(expected, PL03Ex5.checkFirstPalindromeFoundInNumber(number));
    }

    @Test
    public void shouldReturnNullWhenIsNotPalindrome() {
        long number = 123452L;
        assertNull(PL03Ex5.checkFirstPalindromeFoundInNumber(number));
    }
    /** NOT REQUESTED for this exercise **/
}