package org.example;

public class PL03Ex2V2 {
    public static int getNumberOfMultiplesBetweenTwoLimits(int n, int minLimit, int maxLimit) {
        if (n == 0) return maxLimit - minLimit;
        if (n < 0) return -1;
        if (!validateLimits(minLimit, maxLimit)) return -1;

        int multiplesCount = 0;

        for (int i = 0; i <= (maxLimit - minLimit); i++) {
            if ((minLimit + i) % n == 0) multiplesCount++;
        }

        return multiplesCount;
    }

    public static int[] getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits(int x, int y, int minLimit, int maxLimit) {
        if (x < 0 || y < 0) return null;

        int multiplesOfX = getNumberOfMultiplesBetweenTwoLimits(x, minLimit, maxLimit);
        int multiplesOfY = getNumberOfMultiplesBetweenTwoLimits(y, minLimit, maxLimit);

        return new int[] {multiplesOfX, multiplesOfY};
    }

    public static int getSumOfMultiplesOfTwoNumbersInAGivenRange(int x, int y, int minLimit, int maxLimit) {
        int[] numberOfMultiples = getNumberOfMultiplesOfTwoNumbersBetweenTwoLimits(x, y, minLimit, maxLimit);
        if (numberOfMultiples == null) return -1;

        return numberOfMultiples[0] + numberOfMultiples[1];
    }

    private static boolean validateLimits(int minLimit, int maxLimit) {
        if (minLimit < 0) return false;
        return maxLimit > minLimit;
    }
}
