package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex3V2Test {
    @Test
    public void shouldReturnSumAllPairs() {
        int minLimit = 0;
        int maxLimit = 10;
        int parityCode = 0;
        int expected = 20;
        assertEquals(expected, PL03Ex3V2.sumOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, parityCode));
    }

    @Test
    public void shouldReturnSumAllPairsEqualLimits() {
        int minLimit = 10;
        int maxLimit = 10;
        int parityCode = 0;
        int expected = 10;
        assertEquals(expected, PL03Ex3V2.sumOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, parityCode));
    }

    @Test
    public void shouldReturnSumAllPairsNegativeMinLimit() {
        int minLimit = -10;
        int maxLimit = 10;
        int operationCode = 0;
        int expected = 0;
        assertEquals(expected, PL03Ex3V2.sumOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, operationCode));
    }
    // not pairs
    @Test
    public void shouldReturnSumAllNotPairs() {
        int minLimit = 0;
        int maxLimit = 10;
        int parityCode = 1;
        int expected = 25;
        assertEquals(expected, PL03Ex3V2.sumOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, parityCode));
    }

    @Test
    public void shouldReturnSumAllNotPairsEqualLimits() {
        int minLimit = 10;
        int maxLimit = 10;
        int parityCode = 1;
        int expected = 0;
        assertEquals(expected, PL03Ex3V2.sumOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, parityCode));
    }

    /** count of pairs **/
    @Test
    public void shouldCountAllPairs() {
        int minLimit = 0;
        int maxLimit = 10;
        int parityCode = 0;
        int expected = 6;
        assertEquals(expected, PL03Ex3V2.countOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, parityCode));
    }

    @Test
    public void shouldCountAllNotPairs() {
        int minLimit = 0;
        int maxLimit = 10;
        int parityCode = 1;
        int expected = 5;
        assertEquals(expected, PL03Ex3V2.countOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, parityCode));
    }

    @Test
    public void shouldCountAllNotPairsNegativeMinLimit() {
        int minLimit = -10;
        int maxLimit = 10;
        int parityCode = 1;
        int expected = 10;
        assertEquals(expected, PL03Ex3V2.countOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, parityCode));
    }

    /** multiplication **/
    @Test
    public void shouldMultiplyAllNumbersCorrectlyForALessThanB() {
        int n = 2;
        int a = 0;
        int b = 10;
        int operationCode = 1;
        int expected = 3840;
        assertEquals(expected, PL03Ex3V2.operationOnMultiplesOfNumberBetweenInterval(n, a, b, operationCode));
    }

    @Test
    public void shouldMultiplyAllNumbersCorrectlyForBLessThanA() {
        int n = 2;
        int a = 10;
        int b = 0;
        int operationCode = 1;
        int expected = 3840;
        assertEquals(expected, PL03Ex3V2.operationOnMultiplesOfNumberBetweenInterval(n, a, b, operationCode));
    }

    @Test
    public void shouldMultiplyAllNumbersCorrectlyForAEqualsB() {
        int n = 2;
        int a = 10;
        int b = 10;
        int operationCode = 1;
        int expected = 10;
        assertEquals(expected, PL03Ex3V2.operationOnMultiplesOfNumberBetweenInterval(n, a, b, operationCode));
    }

    @Test
    public void shouldMultiplyAllNumbersCorrectlyForAAndBEqualsZero() {
        int n = 2;
        int a = 0;
        int b = 0;
        int operationCode = 1;
        int expected = 1;
        assertEquals(expected, PL03Ex3V2.operationOnMultiplesOfNumberBetweenInterval(n, a, b, operationCode));
    }

    /** average **/
    @Test
    public void shouldGetAverageCorrectlyForALessThanB() {
        int n = 2;
        int a = 0;
        int b = 10;
        double expected = 3.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesInInterval(n, a, b));
    }

    @Test
    public void shouldGetAverageCorrectlyForBLessThanA() {
        int n = 2;
        int a = 10;
        int b = 0;
        double expected = 3.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesInInterval(n, a, b));
    }

    @Test
    public void shouldGetAverageCorrectlyForAEqualsB() {
        int n = 2;
        int a = 10;
        int b = 10;
        double expected = -1.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesInInterval(n, a, b));
    }

    @Test
    public void shouldGetAverageCorrectlyForAAndBEqualsZero() {
        int n = 2;
        int a = 0;
        int b = 0;
        double expected = -1.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesInInterval(n, a, b));
    }

    /** averageOfMultiplesOfOneOrOtherNumberInInterval **/
    @Test
    public void shouldGetAverageCorrectlyForXAndForALessThanB() {
        int x = 2;
        int y = 5;
        int a = 0;
        int b = 10;
        int selectedNumber = 0;
        double expected = 3.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }

    @Test
    public void shouldGetAverageCorrectlyForXAndBLessThanA() {
        int x = 2;
        int y = 5;
        int a = 10;
        int b = 0;
        int selectedNumber = 0;
        double expected = 3.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }

    @Test
    public void shouldGetAverageCorrectlyForXAndAEqualsB() {
        int x = 2;
        int y = 5;
        int a = 10;
        int b = 10;
        int selectedNumber = 0;
        double expected = -1.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }

    @Test
    public void shouldGetAverageCorrectlyForXAndForAAndBEqualsZero() {
        int x = 2;
        int y = 5;
        int a = 0;
        int b = 0;
        int selectedNumber = 0;
        double expected = -1.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }

    // tests for Y
    @Test
    public void shouldGetAverageCorrectlyForYAndForALessThanB() {
        int x = 2;
        int y = 5;
        int a = 0;
        int b = 10;
        int selectedNumber = 1;
        double expected = 1.5;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }

    @Test
    public void shouldGetAverageCorrectlyForYAndBLessThanA() {
        int x = 2;
        int y = 2;
        int a = 10;
        int b = 0;
        int selectedNumber = 1;
        double expected = 3.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }

    @Test
    public void shouldGetAverageCorrectlyForYAndAEqualsB() {
        int x = 2;
        int y = 2;
        int a = 10;
        int b = 10;
        int selectedNumber = 1;
        double expected = -1.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }

    @Test
    public void shouldGetAverageCorrectlyForYAndForAAndBEqualsZero() {
        int x = 2;
        int y = 2;
        int a = 0;
        int b = 0;
        int selectedNumber = 1;
        double expected = -1.0;
        assertEquals(expected, PL03Ex3V2.averageOfMultiplesOfOneOrOtherNumberInInterval(x, y, a, b, selectedNumber));
    }
}