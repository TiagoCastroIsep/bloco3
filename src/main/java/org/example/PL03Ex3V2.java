package org.example;

public class PL03Ex3V2 {
    public static int sumOfAllPairsOrNotPairsInAGiveInterval(int minLimit, int maxLimit, int parityCode) {
        /** for pairs code 0, for not pairs, any other number is accepted **/
        if (minLimit == maxLimit) {
            int operationCode = 0;
            return getCalculationForMinLimitEqualsMaxLimit(minLimit, parityCode);
        }

        return runSumLoopThroughInterval(minLimit, maxLimit, parityCode);
    }

    public static int countOfAllPairsOrNotPairsInAGiveInterval(int minLimit, int maxLimit, int parityCode) {
        if (minLimit == maxLimit) {
            int operationCode = 1;
            return getCalculationForMinLimitEqualsMaxLimit(minLimit, parityCode);
        }
        return runCountLoopThroughInterval(minLimit, maxLimit, parityCode);
    }

    private static int getCalculationForMinLimitEqualsMaxLimit(int minLimit, int parityCode) {
        if (parityCode == 0) return minLimit % 2 == 0 ? minLimit : 0;

        return minLimit % 2 != 0 ? minLimit : 0;
    }

    /**
     * Limits a and b might not be ordered so we need to validate. Also multiples are >= 0
     **/
    public static int operationOnMultiplesOfNumberBetweenInterval(int n, int a, int b, int operationCode) {
        /** operation code for sum == 0, for multiplication == 1**/
        int[] orderedInterval = validateIntervalValues(a, b);
        if (orderedInterval == null) return -1;

        int minInterval = orderedInterval[0];
        int maxInterval = orderedInterval[1];

        return runMultiplesLoopThroughInterval(n, minInterval, maxInterval, operationCode);
    }

    public static double averageOfMultiplesInInterval(int n, int a, int b) {
        if (a == b) return -1.0;
        int[] orderedInterval = validateIntervalValues(a, b);
        if (orderedInterval == null) return -1.0;

        int minValue = orderedInterval[0];
        int maxValue = orderedInterval[1];
        int operationCode = 0; // to get the sum

        double multiplesSum = runMultiplesLoopThroughInterval(n, minValue, maxValue, operationCode);
        double totalInterval = maxValue - minValue;

        return multiplesSum / totalInterval;
    }

    public static double averageOfMultiplesOfOneOrOtherNumberInInterval(int x, int y, int a, int b, int selectedNumber) {
        /** assuming X or Y and that selectedNumber==0 is a code to run x and selectedNumber==1 is a code to run y **/
        if (a == b) return -1.0;
        if (x < 0) return -1.0;
        if (y < 0) return -1.0;

        int[] orderedInterval = validateIntervalValues(a, b);
        if (orderedInterval == null) return -1.0;

        int minValue = orderedInterval[0];
        int maxValue = orderedInterval[1];
        int operationCode = 0; // to get the sum

        return runAverageCalculation(x, y, selectedNumber, minValue, maxValue, operationCode);
    }

    private static double runAverageCalculation(int x, int y, int selectedNumber, int minValue, int maxValue, int operationCode) {
        double multiplesSum;
        if (selectedNumber == 0) {
            multiplesSum = runMultiplesLoopThroughInterval(x, minValue, maxValue, operationCode);
        } else {
            multiplesSum = runMultiplesLoopThroughInterval(y, minValue, maxValue, operationCode);
        }
        double totalInterval = maxValue - minValue;

        return multiplesSum / totalInterval;
    }

    private static int runSumLoopThroughInterval(int minLimit, int maxLimit, int parityCode) {
        if (minLimit < 0 && maxLimit > 0) maxLimit++;

        int sum = 0;
        if (parityCode == 0) {
            for (int i = minLimit; i < maxLimit; i++) {
                if (i == 0) sum += i; /** zero counts as pair **/
                if (i % 2 == 0) sum += i;
            }

            return sum;
        }

        for (int i = minLimit; i <= maxLimit; i++) {
            if (i % 2 != 0) sum += i;
        }

        return sum;
    }

    private static int runCountLoopThroughInterval(int minLimit, int maxLimit, int parityCode) {
        int count = 0;
        if (parityCode == 0) {
            for (int i = minLimit; i < maxLimit; i++) {
                if (i == 0) count++; /** zero counts as pair **/
                if (i % 2 == 0) count++;
            }

            return count;
        }

        for (int i = minLimit; i < maxLimit; i++) {
            if (i % 2 != 0) count++;
        }

        return count;
    }

    private static int runMultiplesLoopThroughInterval(int n, int minLimit, int maxLimit, int operationCode) {
        if (operationCode == 0) {
            int sum = 0;
            for (int i = minLimit; i <= maxLimit; i++) {
                if (i == 0) sum += i; /** zero counts as multiple **/
                if (i % n == 0) sum += i;
            }

            return sum;
        }

        int multiplication = 1;
        for (int i = minLimit; i <= maxLimit; i++) {
            if (i == 0) continue; /** zero counts as multiple **/
            if (i % n == 0) multiplication *= i;
        }

        return multiplication;
    }

    private static int[] validateIntervalValues(int a, int b) {
        if (a < 0) return null;
        if (b < 0) return null;

        if (a > b) return new int[]{b, a};
        return new int[]{a, b};
    }
    /** cant return error code because I'm accepting all numbers until e) **/
}
