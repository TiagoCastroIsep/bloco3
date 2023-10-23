package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex2V2Test {
    @Test
    public void shouldReturnMultiplesOfAGivenNumberBetweenLimits_getNumberOfMultiplesBetweenTwoLimits() {
        int n = 2;
        int minLimit = 0;
        int maxLimit = 10;
        int expected = 6;
        assertEquals(expected, PL03Ex2V2.getNumberOfMultiplesBetweenTwoLimits(n,minLimit,maxLimit));
    }

    @Test
    public void shouldReturnMultipleOfZeroIs1_getNumberOfMultiplesBetweenTwoLimits() {
        int n = 0;
        int minLimit = 0;
        int maxLimit = 10;
        int expected = maxLimit - minLimit;
        assertEquals(expected, PL03Ex2V2.getNumberOfMultiplesBetweenTwoLimits(n,minLimit,maxLimit));
    }

    @Test
    public void shouldReturnMinus1ForNLessThanZero_getNumberOfMultiplesBetweenTwoLimits() {
        int n = -1;
        int minLimit = 0;
        int maxLimit = 10;
        int expected = -1;
        assertEquals(expected, PL03Ex2V2.getNumberOfMultiplesBetweenTwoLimits(n,minLimit,maxLimit));
    }

    @Test
    public void shouldReturnMinus1ForMinLimitLessThanZero_getNumberOfMultiplesBetweenTwoLimits() {
        int n = 2;
        int minLimit = -1;
        int maxLimit = 10;
        int expected = -1;
        assertEquals(expected, PL03Ex2V2.getNumberOfMultiplesBetweenTwoLimits(n,minLimit,maxLimit));
    }

    @Test
    public void shouldReturnMinus1ForMinLimitLessBiggerThanMaxLimit_getNumberOfMultiplesBetweenTwoLimits() {
        int n = 2;
        int minLimit = 2;
        int maxLimit = 1;
        int expected = -1;
        assertEquals(expected, PL03Ex2V2.getNumberOfMultiplesBetweenTwoLimits(n,minLimit,maxLimit));
    }

    /** getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits **/
    @Test
    public void shouldReturnArrayWithXMultiplesAndYMultiples_getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits() {
        int x = 3;
        int y = 5;
        int minLimit = 0;
        int maxLimit = 10;
        int[] expected = {4, 3};
        assertArrayEquals(expected, PL03Ex2V2.getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits(x, y, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnArrayWithXMultiplesAndYMultiplesForXEqualsZero_getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits() {
        int x = 0;
        int y = 5;
        int minLimit = 0;
        int maxLimit = 10;
        int[] expected = {maxLimit - minLimit, 3};
        assertArrayEquals(expected, PL03Ex2V2.getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits(x, y, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnArrayWithXMultiplesAndYMultiplesForYEqualsZero_getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits() {
        int x = 3;
        int y = 0;
        int minLimit = 0;
        int maxLimit = 10;
        int[] expected = {4, maxLimit - minLimit};
        assertArrayEquals(expected, PL03Ex2V2.getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits(x, y, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnNullForXLessThanZero_getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits() {
        int x = -1;
        int y = 5;
        int minLimit = 0;
        int maxLimit = 10;
        assertNull(PL03Ex2V2.getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits(x, y, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnNullForYLessThanZero_getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits() {
        int x = 3;
        int y = -1;
        int minLimit = 0;
        int maxLimit = 10;
        assertNull(PL03Ex2V2.getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits(x, y, minLimit, maxLimit));
    }

    /** getSumOfMultiplesOfTwoNumbersInAGivenRange **/
    @Test
    public void shouldReturnCorrectSumOfTheMultiples_getSumOfMultiplesOfTwoNumbersInAGivenRange() {
        int x = 3;
        int y = 5;
        int minLimit = 0;
        int maxLimit = 10;
        int expected = 7;
        assertEquals(expected, PL03Ex2V2.getSumOfMultiplesOfTwoNumbersInAGivenRange(x, y, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnMinus1ForXLessThanZero_getSumOfMultiplesOfTwoNumbersInAGivenRange() {
        int x = -1;
        int y = 5;
        int minLimit = 0;
        int maxLimit = 10;
        int expected = -1;
        assertEquals(expected, PL03Ex2V2.getSumOfMultiplesOfTwoNumbersInAGivenRange(x, y, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnMinus1ForYLessThanZero_getSumOfMultiplesOfTwoNumbersInAGivenRange() {
        int x = 3;
        int y = -1;
        int minLimit = 0;
        int maxLimit = 10;
        int expected = -1;
        assertEquals(expected, PL03Ex2V2.getSumOfMultiplesOfTwoNumbersInAGivenRange(x, y, minLimit, maxLimit));
    }
}