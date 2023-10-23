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

    // TODO: teste da situação em que minLimit == maxLimit para a multiplicação e average
    @Test
    public void shouldReturnSumAllPairsNegativeMinLimit() {
        int minLimit = -10;
        int maxLimit = 10;
        int operationCode = 0;
        int expected = 0;
        assertEquals(expected, PL03Ex3V2.sumOfAllPairsOrNotPairsInAGiveInterval(minLimit, maxLimit, operationCode));
    }

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
}