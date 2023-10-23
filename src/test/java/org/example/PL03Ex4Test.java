package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex4Test {
    @Test
    public void shouldReturnCorrectReversedValue_getReversedOrderOfLongNumberMethod() {
        long number = 1234L;
        long expected = 4321L;
        assertEquals(expected, PL03Ex4.getReversedOrderOfLongNumber(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZeroInReversedValue_getReversedOrderOfLongNumberMethod() {
        long number = -1L;
        long expected = -1L;
        assertEquals(expected, PL03Ex4.getReversedOrderOfLongNumber(number));
    }

    @Test
    public void shouldReturnZeroForNumberZeroInReversedValue_getReversedOrderOfLongNumberMethod() {
        long number = 0L;
        long expected = 0L;
        assertEquals(expected, PL03Ex4.getReversedOrderOfLongNumber(number));
    }

    /** getReversedArray **/
    @Test
    public void shouldCatchNullForEmptyDigitsArray_getReversedArrayMethod() {
        long[] digitsArray = new long[0];
        assertNull(PL03Ex4.getReversedArray(digitsArray));
    }

    @Test
    public void shouldCatchNullForNullDigitsArray_getReversedArrayMethod() {
        long[] digitsArray = null;
        assertNull(PL03Ex4.getReversedArray(digitsArray));
    }

    @Test
    public void shouldReturnCorrectValueForDigitsArrayWithJustOneElement_getReversedArrayMethod() {
        long[] digitsArray = new long[] {0};
        long[] expected = new long[] {0};
        assertArrayEquals(expected, PL03Ex4.getReversedArray(digitsArray));
    }

    /** getSumAllDigitsFromArray method **/
    @Test
    public void shouldReturnCorrectSumOfAllDigits_getSumAllDigitsFromArrayMethod() {
        long number = 1234L;
        long expected = 10L;
        assertEquals(expected, PL03Ex4.getSumAllDigitsFromArray(number));
    }

    @Test
    public void shouldReturnZeroOnSumOfAllDigitsWhenNumberEqualsZero_getSumAllDigitsFromArrayMethod() {
        long number = 0L;
        long expected = 0L;
        assertEquals(expected, PL03Ex4.getSumAllDigitsFromArray(number));
    }

    @Test
    public void shouldReturnMinus1OnSumOfAllDigitsWhenNumberLessThanZero_getSumAllDigitsFromArrayMethod() {
        long number = -1L;
        long expected = -1L;
        assertEquals(expected, PL03Ex4.getSumAllDigitsFromArray(number));
    }

    /** getSumOfPairsOrNotPairsFromDigitArray method **/
    @Test
    public void shouldReturnCorrectSumOfAllDigitsThatArePairs_getSumOfPairsOrNotPairsFromDigitArray() {
        long number = 1234L;
        String parity = "pair";
        long expected = 6L;
        assertEquals(expected, PL03Ex4.getSumOfPairsOrNotPairsFromDigitArray(number, parity));
    }

    @Test
    public void shouldReturnCorrectSumOfAllDigitsThatAreNotPairs_getSumOfPairsOrNotPairsFromDigitArray() {
        long number = 1234L;
        String parity = "not pair";
        long expected = 4L;
        assertEquals(expected, PL03Ex4.getSumOfPairsOrNotPairsFromDigitArray(number, parity));
    }

    @Test
    public void shouldReturnCorrectSumOfAllDigitsThatAreNotPairsWithDifferentString_getSumOfPairsOrNotPairsFromDigitArray() {
        long number = 1234L;
        String parity = "% something else %";
        long expected = 4L;
        assertEquals(expected, PL03Ex4.getSumOfPairsOrNotPairsFromDigitArray(number, parity));
    }

    @Test
    public void shouldReturnMinus1ForEmptyString_getSumOfPairsOrNotPairsFromDigitArray() {
        long number = 1234L;
        String parity = "      ";
        long expected = -1L;
        assertEquals(expected, PL03Ex4.getSumOfPairsOrNotPairsFromDigitArray(number, parity));
    }

    @Test
    public void shouldReturnMinus1ForPairsWhenCantFindPairsInNumber_getSumOfPairsOrNotPairsFromDigitArray() {
        long number = 1333335L;
        String parity = "pair";
        long expected = 0L;
        assertEquals(expected, PL03Ex4.getSumOfPairsOrNotPairsFromDigitArray(number, parity));
    }

    @Test
    public void shouldReturnMinus1ForNotPairsPairsWhenCantFindNotPairsInNumber_getSumOfPairsOrNotPairsFromDigitArray() {
        long number = 2648L;
        String parity = "not pair";
        long expected = 0L;
        assertEquals(expected, PL03Ex4.getSumOfPairsOrNotPairsFromDigitArray(number, parity));
    }

    /** getAverageFromDigitArray method **/
    @Test
    public void shouldReturnCorrectAverageOfAllDigits_getAverageFromDigitArray() {
        long number = 2648L;
        long expected = 5L;
        assertEquals(expected, PL03Ex4.getAverageFromDigitArray(number));
    }

    @Test
    public void shouldReturnMinus1ForNegativeNumberAverageOfAllDigits_getAverageFromDigitArray() {
        long number = -1L;
        long expected = -1L;
        assertEquals(expected, PL03Ex4.getAverageFromDigitArray(number));
    }

    @Test
    public void shouldReturnZeroForNumberZeroInAverageOfAllDigits_getAverageFromDigitArray() {
        long number = 0L;
        long expected = 0L;
        assertEquals(expected, PL03Ex4.getAverageFromDigitArray(number));
    }

    /** getAverageFromPairOrNotPairDigitArray method **/
    @Test
    public void shouldReturnCorrectAverageFromPair_getAverageFromPairOrNotPairDigitArray() {
        long number = 1234L;
        String parity = "pair";
        double expected = 0.6;
        assertEquals(expected, PL03Ex4.getAverageFromPairOrNotPairDigitArray(number, parity));
    }

    @Test
    public void shouldReturnCorrectAverageFromNotPair_getAverageFromPairOrNotPairDigitArray() {
        long number = 1234L;
        String parity = "not pair";
        double expected = 0.4;
        assertEquals(expected, PL03Ex4.getAverageFromPairOrNotPairDigitArray(number, parity));
    }

    @Test
    public void shouldReturnMinus1ForNegativeNumber_getAverageFromPairOrNotPairDigitArray() {
        long number = -1L;
        String parity = "not pair";
        double expected = -1;
        assertEquals(expected, PL03Ex4.getAverageFromPairOrNotPairDigitArray(number, parity));
    }

    @Test
    public void shouldReturnZeroForZeroNumber_getAverageFromPairOrNotPairDigitArray() {
        long number = 0L;
        String parity = "not pair";
        double expected = 0;
        assertEquals(expected, PL03Ex4.getAverageFromPairOrNotPairDigitArray(number, parity));
    }
}