package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex15Test {
    @Test
    public void shouldReturnCorrectValue() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[] {1, 3, 5, 7, 2, 4, 6};
        assertArrayEquals(expected, PL03Ex15.getSortedPairsAndNotPairs(array));
    }

    @Test
    public void shouldReturnNullForArrayIsEmpty() {
        int[] array = new int[0];
        assertNull(PL03Ex15.getSortedPairsAndNotPairs(array));
    }

    @Test
    public void shouldReturnNullForPairArrayIsEmpty() {
        int[] array = new int[] {1, 1, 3, 5, 5, 7, 7};
        assertNull(PL03Ex15.getSortedPairsAndNotPairs(array));
    }

    @Test
    public void shouldReturnNullForNotPairArrayIsEmpty() {
        int[] array = new int[] {2, 2, 4, 6, 6, 8, 8};
        assertNull(PL03Ex15.getSortedPairsAndNotPairs(array));
    }
}