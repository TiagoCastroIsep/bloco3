package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex2Test {
    @Test
    public void shouldReturnCorrectValueWhenBothInputsHaveOneOrMoreMultiples() {
        int[] expected = {3, 6, 8};
        assertArrayEquals(expected, PL03Ex2.getConcatenatedMultiples(3, 1, 6, 4, 5, 10));
    }

    @Test
    public void shouldReturnCorrectValueWhenBothInputsHaveOneOrMoreMultiplesBiggerLimit() {
        int[] expected = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 8, 12, 16, 20, 24};
        assertArrayEquals(expected, PL03Ex2.getConcatenatedMultiples(3, 1, 50, 4, 5, 25));
    }

    /** minLimit <= 0 **/
    @Test
    public void shouldReturnEmptyArrayWhenMinLimitXIsLessOrEqualZero() {
        int[] expected = new int[0];
        assertArrayEquals(expected, PL03Ex2.getConcatenatedMultiples(3, 0, 6, 4, 5, 10));
    }

    @Test
    public void shouldReturnEmptyArrayWhenMinLimitYIsLessOrEqualZero() {
        int[] expected = new int[0];
        assertArrayEquals(expected, PL03Ex2.getConcatenatedMultiples(3, 1, 6, 4, 0, 10));
    }

    /** maxLimit <= minLimit **/
    @Test
    public void shouldReturnEmptyArrayWhenMaxLimitXIsLessOrEqualMinLimit() {
        int[] expected = new int[0];
        assertArrayEquals(expected, PL03Ex2.getConcatenatedMultiples(3, 10, 6, 4, 5, 10));
    }

    @Test
    public void shouldReturnEmptyArrayWhenMaxLimitYIsLessOrEqualMinLimit() {
        int[] expected = new int[0];
        assertArrayEquals(expected, PL03Ex2.getConcatenatedMultiples(3, 10, 6, 4, 5, 2));
    }

    @Test
    public void shouldReturnAllLimitNumbersWhenBaseNumberIsZero() {
        int[] expected = {1, 2, 3, 8};
        assertArrayEquals(expected, PL03Ex2.getConcatenatedMultiples(0, 1, 3, 4, 5, 10));
    }
}