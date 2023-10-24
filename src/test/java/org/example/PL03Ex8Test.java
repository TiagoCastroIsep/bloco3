package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex8Test {
    @Test
    public void shouldReturnCorrectValueWhenNumberIsValidForPairNumber() {
        int number = 6;
        List<List<Integer>> expected = List.of(
                List.of(0, 6),
                List.of(1, 5),
                List.of(2, 4),
                List.of(3, 3)
        );
        assertEquals(expected, PL03Ex8.getAllSumCombinations(number));
    }

    @Test
    public void shouldReturnCorrectValueWhenNumberIsValidNotPairNumber() {
        int number = 5;
        List<List<Integer>> expected = List.of(
                List.of(0, 5),
                List.of(1, 4),
                List.of(2, 3)
        );
        assertEquals(expected, PL03Ex8.getAllSumCombinations(number));
    }

    @Test
    public void shouldReturnListWithListOfZeroWhenNumberIsZero() {
        int number = 0;
        List<List<Integer>> expected = List.of(List.of(0));
        assertEquals(expected, PL03Ex8.getAllSumCombinations(number));
    }

    @Test
    public void shouldReturnNullWhenNumberIsLessThanZero() {
        int number = -1;
        assertNull(PL03Ex8.getAllSumCombinations(number));
    }

    @Test
    public void shouldReturnNullWhenNumberIsMoreThan20() {
        int number = 21;
        assertNull(PL03Ex8.getAllSumCombinations(number));
    }

    /** alternative solution with int[][] **/
    @Test
    public void shouldReturnCorrectValue() {
        int number = 5;
        int[][] expected = {
                {0, 5},
                {1, 4},
                {2, 3}
        };
        assertArrayEquals(expected, PL03Ex8.getAllSumCombinationsAlternativeSolution(number));
    }

    @Test
    public void shouldReturnCorrectValueFor20() {
        int number = 20;
        int[][] expected = {
                {10, 10},
        };
        assertArrayEquals(expected, PL03Ex8.findCombinationsAlternativeSolution(number));
    }

    @Test
    public void shouldReturnCorrectValueFor20_ArrayList() {
        int number = 20;
        List<Integer> result = new ArrayList<>();
        result.add(0, 10);
        result.add(1, 10);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(result);
        assertEquals(expected, PL03Ex8.getAllSumCombinations(number));
    }
}