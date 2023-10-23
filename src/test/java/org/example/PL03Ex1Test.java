package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex1Test {
    @Test
    public void shouldReturnMinus1WhenNumLessThanZero() {
        int num = -1;
        int expected = -1;
        assertEquals(expected, PL03Ex1.factorialSolution(num));
    }

    @Test
    public void shouldReturnMinus2WhenNumMoreOrEquals20() {
        int num = 20;
        int expected = -2;
        assertEquals(expected, PL03Ex1.factorialSolution(num));
    }

    @Test
    public void shouldReturnCorrectResultForFactorialOfZero() {
        int num = 0;
        int expected = 1;
        assertEquals(expected, PL03Ex1.factorialSolution(num));
    }

    @Test
    public void shouldReturnCorrectResultForFactorialOfMinValueForCalculation() {
        int num = 1;
        int expected = 1;
        assertEquals(expected, PL03Ex1.factorialSolution(num));
    }

    @Test
    public void shouldReturnCorrectResultForFactorialOfMaxValueForCalculation() {
        int num = 19;
        int expected = 109641728;
        assertEquals(expected, PL03Ex1.factorialSolution(num));
    }
}