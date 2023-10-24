package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PL03Ex8 {
    // given number from 1 to 20 return all possible combinations of the sum of two int numbers from 0 to 10
    // ex: number=5 so result is => [[0+5], [1+4], [2+3]]

    public static List<List<Integer>> getAllSumCombinations(int number) {
        if (!validateNumberInput(number)) return null;

        return findCombinations(number);
    }

    private static List<List<Integer>> findCombinations(int number) {
        Integer[] sums = new Integer[2];
        List<List<Integer>> combinations = new ArrayList<>();

        if (number == 0) {
            combinations.add(List.of(new Integer[] {0}));
            return combinations;
        }

        for (int i = 0, j = number - i; i < (number / 2) + 1; i++) {
            if (j > 10) {
                j--;
                continue;
            }
            sums[0] = i;
            sums[1] = j;
            j--;
            combinations.add(List.of(sums));
        }

        return combinations;
    }

    /** START - Alternative solution with just plain arrays **/
    public static int[][] getAllSumCombinationsAlternativeSolution(int number) {
        if (!validateNumberInput(number)) return null;

        return findCombinationsAlternativeSolution(number);
    }

    public static int[][] findCombinationsAlternativeSolution(int number) {
        int arrayLength = findArrayLength(number);
        int[][] sums = new int[arrayLength][2];

        int count = 0;
        for (int i = 0, j = number - i; i <= number / 2; i++) {
            if (j > 10) {
                j--;
                continue;
            }
            sums[count][0] = i;
            sums[count][1] = j;
            j--;
            count++;
        }

        return sums;
    }

    private static int findArrayLength(int number) {
        int count = 0;
        for (int i = 0, j = number - i; i <= number / 2; i++) {
            if (j > 10) {
                j--;
                continue;
            }
            count++;
        }
        return count;
    }
    /** END - Alternative solution with just plain arrays **/

    private static boolean validateNumberInput(int number) {
        if (number < 0) return false;
        return number <= 20;
    }
}
