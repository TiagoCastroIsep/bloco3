package org.example;

import java.util.Arrays;

public class PL03Ex15 {
    public static int[] getSortedPairsAndNotPairs(int[] array) {
        if (array.length == 0) return null;

        int[] newArr = new int[array.length];

        int[] arrPairs = getArrPairs(array);
        int[] arrNotPairs = getNotPairs(array);

        // if one of the arrays is empty can't return the expected result
        if (arrPairs.length == 0) return null;
        if (arrNotPairs.length == 0) return null;

        // concatenate strings
        // int[] newArr = IntStream.concat(Arrays.stream(arrPairs), Arrays.stream(arrNotPairs)).toArray();

        // or with for loop
        runLoopToFillArrayToReturn(arrNotPairs, newArr, arrPairs);

        return newArr;
    }

    private static void runLoopToFillArrayToReturn(int[] arrNotPairs, int[] newArr, int[] arrPairs) {
        for (int i = 0; i < arrNotPairs.length; i++) {
            newArr[i] = arrNotPairs[i];
        }

        for (int i = arrNotPairs.length, j = 0; i < arrPairs.length + arrNotPairs.length; i++) {
            newArr[i] = arrPairs[j];
            j++;
        }
    }

    private static int[] getNotPairs(int[] array) {
        return Arrays.stream(array).filter(el -> el % 2 != 0).toArray();
    }

    private static int[] getArrPairs(int[] array) {
        return Arrays.stream(array).filter(el -> el % 2 == 0).toArray();
    }
}
