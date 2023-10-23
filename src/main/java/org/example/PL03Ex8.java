package org.example;

import java.util.ArrayList;
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

        for (int i = 0; i < (number / 2) + 1; i++) {
            sums[0] = i;
            sums[1] = number - i;
            combinations.add(List.of(sums));
        }

        return combinations;
    }

    /** START - Alternative solution with just plain arrays **/
    public static int[][] getAllSumCombinationsAlternativeSolution(int number) {
        if (!validateNumberInput(number)) return null;

        return findCombinationsAlternativeSolution(number);
    }

    private static int[][] findCombinationsAlternativeSolution(int number) {
        int[][] sums = new int[(number / 2) + 1][2];

        for (int i = 0; i <= number / 2; i++) {
            sums[i][0] = i;
            sums[i][1] = number - i;
        }

        return sums;
    }
    /** END - Alternative solution with just plain arrays **/

    private static boolean validateNumberInput(int number) {
        if (number < 0) return false;
        return number <= 20;
    }
}
