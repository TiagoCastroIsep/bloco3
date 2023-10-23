package org.example;

public class PL03Ex2 {
    public static int[] getConcatenatedMultiples(int x, int minLimitX, int maxLimitX,
                                                 int y, int minLimitY, int maxLimitY) {
        int[] multiplesArray1 = getMultiplesOfXBetweenLimits(x, minLimitX, maxLimitX);
        int[] multiplesArray2 = getMultiplesOfXBetweenLimits(y, minLimitY, maxLimitY);

        if (multiplesArray1 == null) return new int[0];
        if (multiplesArray2 == null) return new int[0];

        return runConcatenation(multiplesArray1, multiplesArray2);
    }

    private static int[] getMultiplesOfXBetweenLimits(int x, int minLimit, int maxLimit) {
        if (minLimit <= 0) return null;
        if (maxLimit <= minLimit) return null;

        if (x == 0) return getReturnFromXEqualsZero(minLimit, maxLimit);

        int arraySize = getNumberOfMultiples(x, minLimit, maxLimit);

        int[] result = new int[arraySize];

        for (int i = 0, j = 0; i <= (maxLimit - minLimit); i++) {
            if ((minLimit + i) % x == 0) {
                result[j] = minLimit + i;
                j++;
            }
        }

        return result;
    }

    private static int[] getReturnFromXEqualsZero(int minLimit, int maxLimit) {
        int[] resultArray = new int[maxLimit - minLimit + 1];

        for (int i = 0; i <= (maxLimit - minLimit); i++) {
            resultArray[i] = minLimit + i;
        }

        return resultArray;
    }

    private static int getNumberOfMultiples(int x, int minLimit, int maxLimit) {
        int multiplesCount = 0;

        for (int i = 0; i <= (maxLimit - minLimit); i++) {
            if ((minLimit + i) % x == 0) multiplesCount++;
        }

        return multiplesCount;
    }

    private static int[] runConcatenation(int[] multiplesArray1, int[] multiplesArray2) {
        int concatArrayLength = multiplesArray1.length + multiplesArray2.length;
        int[] concatResult = new int[concatArrayLength];

        for (int i = 0; i < multiplesArray1.length; i++) {
            concatResult[i] = multiplesArray1[i];
        }

        for (int i = 0; i < multiplesArray2.length; i++) {
            concatResult[multiplesArray1.length + i] = multiplesArray2[i];
        }

        return concatResult;
    }
}
