package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex3Test {
    /** getAverageOfAllFoundMultiples method **/
    @Test
    public void shouldReturnCorrectValueWhenNEqualsZeroAndAIsBiggerOrEqualsZeroAndBIsNotLessThanA_getAverageOfAllFoundMultiples() {
        int n = 0;
        int a = 0;
        int b = 2;
        int expected = 1;
        assertEquals(expected, PL03Ex3.getAverageOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnCorrectValueWhenNBiggerThanZeroAndAIsBiggerThanB_getAverageOfAllFoundMultiples() {
        int n = 2;
        int a = 10;
        int b = 2;
        int expected = 6;
        assertEquals(expected, PL03Ex3.getAverageOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnCorrectValueWhenNBiggerThanZeroAndAIsEqualToBWhenBothEqualToZero_getAverageOfAllFoundMultiples() {
        int n = 2;
        int a = 0;
        int b = 0;
        int expected = 1;
        assertEquals(expected, PL03Ex3.getAverageOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnCorrectValueWhenNBiggerThanZeroAndAIsEqualToBWhenBothBiggerThanZero_getAverageOfAllFoundMultiples() {
        int n = 2;
        int a = 10;
        int b = 10;
        int expected = 1;
        assertEquals(expected, PL03Ex3.getAverageOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnCorrectValueWhenNMoreThanZeroAndAIsBiggerOrEqualsZeroAndBIsNotLessThanA_getAverageOfAllFoundMultiples() {
        int n = 2;
        int a = 2;
        int b = 20;
        int expected = 11;
        assertEquals(expected, PL03Ex3.getAverageOfAllFoundMultiples(n, a, b));
    }

    /** getProductOfAllFoundMultiples method **/
    @Test
    public void shouldReturnCorrectValueOfZeroWhenNEqualsZero_getProductOfAllFoundMultiples() {
        int n = 0;
        int a = 1;
        int b = 3;
        int expected = 0;
        assertEquals(expected, PL03Ex3.getProductOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnMinus2WhenAMoreThan19_getProductOfAllFoundMultiples() {
        int n = 2;
        int a = 20;
        int b = 0;
        int expected = -2;
        assertEquals(expected, PL03Ex3.getProductOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnMinus2WhenBMoreThan19_getProductOfAllFoundMultiples() {
        int n = 2;
        int a = 2;
        int b = 20;
        int expected = -2;
        assertEquals(expected, PL03Ex3.getProductOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnMinus2WhenAEqualsZero_getProductOfAllFoundMultiples() {
        int n = 2;
        int a = 0;
        int b = 20;
        int expected = 0;
        assertEquals(expected, PL03Ex3.getProductOfAllFoundMultiples(n, a, b));
    }

    @Test
    public void shouldReturnResultWhenNMoreThanZeroAndAAndBAreInsideBounds_getProductOfAllFoundMultiples() {
        int n = 2;
        int a = 1;
        int b = 19;
        int expected = 185794560;
        assertEquals(expected, PL03Ex3.getProductOfAllFoundMultiples(n, a, b));
    }

    /** getSumOfPairOrNotPairInRange method **/
    @Test
    public void shouldReturnGoodResultForPairWithALessThanB_getSumOfPairOrNotPairInRange() {
        int a = 0;
        int b = 100;
        String parity = "pair";
        int expected = 2550;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnGoodResultForPairWithBLessThanA_getSumOfPairOrNotPairInRange() {
        int a = 100;
        int b = 0;
        String parity = "pair";
        int expected = 2550;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnGoodResultForPairWithAEqualsBAndEqualsZero_getSumOfPairOrNotPairInRange() {
        int a = 0;
        int b = 0;
        String parity = "pair";
        int expected = 0;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnGoodResultForPairWithAEqualsBAndMoreThanZero_getSumOfPairOrNotPairInRange() {
        int a = 10;
        int b = 10;
        String parity = "pair";
        int expected = 10;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnGoodResultForNotPairWithAEqualsBAndEqualsZero_getSumOfPairOrNotPairInRange() {
        int a = 0;
        int b = 0;
        String parity = "not pair";
        int expected = 0;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnGoodResultForNotPairWithAEqualsBAndMoreThanZero_getSumOfPairOrNotPairInRange() {
        int a = 10;
        int b = 10;
        String parity = "not pair";
        int expected = 10;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnGoodResultForNotPairWithALessThanB_getSumOfPairOrNotPairInRange() {
        int a = 0;
        int b = 100;
        String parity = "not pair";
        int expected = 2500;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnGoodResultForNotPairWithBLessThanA_getSumOfPairOrNotPairInRange() {
        int a = 100;
        int b = 0;
        String parity = "not pair";
        int expected = 2500;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }

    @Test
    public void shouldReturnMinus1ForEmptyParityString_getSumOfPairOrNotPairInRange() {
        int a = 100;
        int b = 0;
        String parity = "  ";
        int expected = 2500;
        assertEquals(expected, PL03Ex3.getSumOfPairOrNotPairInRange(a, b, parity));
    }
}