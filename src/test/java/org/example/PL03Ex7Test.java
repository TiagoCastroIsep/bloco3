package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex7Test {
    @Test
    public void shouldReturnCorrectValueOnNUpperLimitWithAscArray() {
        int n = 1000000000 - 1;
        int[] nums = new int[30];
        for(int i = 0; i < nums.length; i++) {
            nums[i] += i + 1;
        }
        int expected = 12;
        assertEquals(expected, PL03Ex7.runArrayLookupForSumOfElementsBiggerThanN(nums, n));
    }

    @Test
    public void shouldReturnCorrectValueOnNUpperLimitWithArrayFilledWithValue2AtAllElements() {
        int n = 1000000000 - 1;
        int[] nums = new int[30];
        Arrays.fill(nums, 2);
        int expected = 29;
        assertEquals(expected, PL03Ex7.runArrayLookupForSumOfElementsBiggerThanN(nums, n));
    }

    @Test
    public void shouldReturnMinus1ForArrayFilledWithLessOrEquals1AtEveryPosition() {
        int n = 3;
        int[] nums = new int[10];
        Arrays.fill(nums, 1);
        int expected = -1;
        assertEquals(expected, PL03Ex7.runArrayLookupForSumOfElementsBiggerThanN(nums, n));
    }

    @Test
    public void shouldReturnMinus2ForValueNotFound() {
        int n = 3;
        int[] nums = new int[10];
        nums[0] = 2;
        Arrays.fill(nums, 1, nums.length, 1);
        int expected = -2;
        assertEquals(expected, PL03Ex7.runArrayLookupForSumOfElementsBiggerThanN(nums, n));
    }

    @Test
    public void shouldReturnZeroForNEqualsZero() {
        int n = 0;
        int[] nums = new int[10];
        Arrays.fill(nums, 2);
        int expected = 0;
        assertEquals(expected, PL03Ex7.runArrayLookupForSumOfElementsBiggerThanN(nums, n));
    }

    @Test
    public void shouldReturnMinus1ForNLessThanZero() {
        int n = -1;
        int[] nums = new int[10];
        Arrays.fill(nums, 2);
        int expected = -1;
        assertEquals(expected, PL03Ex7.runArrayLookupForSumOfElementsBiggerThanN(nums, n));
    }

    @Test
    public void shouldReturnMinus1ForNBiggerOrEqualsUpperLimit() {
        int n = 1000000000;
        int[] nums = new int[10];
        Arrays.fill(nums, 2);
        int expected = -1;
        assertEquals(expected, PL03Ex7.runArrayLookupForSumOfElementsBiggerThanN(nums, n));
    }
}