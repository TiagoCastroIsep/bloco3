package org.example;

import java.util.Arrays;

public class PL03Ex4 {
    /** colocar limite máximo e minimo no numero **/
    /** a nível de métodos o exercicio está completo **/

//    public static void apanharNumDigitosDeNumer(long num) {
//        long[] numArray = getArrayFromEachDigit(num);
//        int count = 0;
//        if (numArray == null) return;
//        var data = Arrays.stream(numArray).count();
//        System.out.println(data);
//    }

    public static long getReversedOrderOfLongNumber(long number) {
        long[] digitsArray = getArrayFromEachDigit(number);
        if (digitsArray == null) return -1L;

        long[] reversedArray = getReversedArray(digitsArray);

        long numberInReversedOrder = 0L;

        for (int i = 0; i < reversedArray.length; i++) {
            numberInReversedOrder +=
                    (long) (reversedArray[i] * Math.pow(10, (reversedArray.length - 1 - i)));
        }

        return numberInReversedOrder;
    }

    public static long[] getReversedArray(long[] digitsArray) {
        if (digitsArray == null) return null;
        if (digitsArray.length == 0) return null;

        long[] digits = new long[digitsArray.length];
        for (int i = digitsArray.length - 1, j = 0; i >= 0; i--) {
            digits[j] = digitsArray[i];
            j++;
        }
        return digits;
    }

    public static long getSumAllDigitsFromArray(long number) {
        long[] digitArray = getArrayFromEachDigit(number);

        return sumEachElementFromArray(digitArray);
    }

    public static long sumEachElementFromArray(long[] digitArray) {
        if (digitArray == null) return -1L;
        if (digitArray.length == 1) return digitArray[0];

        long result = 0;

        for (long l : digitArray) {
            result += l;
        }

        return result;
    }


    public static long getSumOfPairsOrNotPairsFromDigitArray(long number, String parity) {
        long arrayLength = getNumberOfPairsOrNotPairsFromDigitArray(number, parity);
        /** arrayLength == 0 means that no pair or not pair elements were found **/
        if (arrayLength == 0) return 0L;
        if (arrayLength == -1) return -1L;

        long[] digitArray = getArrayFromEachDigit(number);

        if (digitArray == null) return -1L;

        return setSumOfPairOrNotPairDigits(digitArray, parity);
    }

    public static long setSumOfPairOrNotPairDigits(long[] digitArray, String parity) {
        long result = 0;
        if (parity.equals("pair")) {
            for (long l : digitArray) {
                if (l % 2 == 0) result += l;
            }
            return result;
        }

        for (long l : digitArray) {
            if (l % 2 != 0) result += l;
        }

        return result;
    }

    public static long getAverageFromDigitArray(long number) {
        long[] digitArray = getArrayFromEachDigit(number);

        if (digitArray == null) return -1L;
        if (digitArray.length == 0) return -1L;

        long sumOfAllValues = getSumAllDigitsFromArray(number);

        return sumOfAllValues / digitArray.length;
    }

    public static double getAverageFromPairOrNotPairDigitArray(long number, String parity) {
        if (parity.trim().isEmpty()) return -1;
        if (number < 0) return -1;
        if (number == 0) return 0;


        long[] digitArray = getArrayOfPairsOrNotPairsFromDigitArray(number, parity);

        if (digitArray == null) return -1L;
        if (digitArray.length == 0) return -1L;

        long sumOfAllValues = getSumAllDigitsFromArray(number);
        long sumOfAllRequestElements = sumEachElementFromArray(digitArray);

        return (double) sumOfAllRequestElements / sumOfAllValues;
    }

    public static long[] getArrayOfPairsOrNotPairsFromDigitArray(long number, String parity) {
        long[] arrayOfDigits = getArrayFromEachDigit(number);

        if (arrayOfDigits == null) return null;

        long numberOfPairOrNotPairDigits = getNumberOfPairsOrNotPairsFromDigitArray(number, parity);

        if (numberOfPairOrNotPairDigits == -1L) return null;

        return setPairOrNotPairArray(arrayOfDigits, numberOfPairOrNotPairDigits, parity);
    }

    public static long[] setPairOrNotPairArray(long[] arrayOfDigits, long numberOfPairOrNotPairDigits, String parity) {
        long[] pairDigitsArray = new long[(int) numberOfPairOrNotPairDigits];

        if (parity.trim().equals("pair")) {
            for (int i = 0, j = 0; i < arrayOfDigits.length; i++) {
                if (arrayOfDigits[i] % 2 == 0) {
                    pairDigitsArray[j] = (int) arrayOfDigits[i];
                    j++;
                }
            }
            return pairDigitsArray;
        }

        for (int i = 0, j = 0; i < arrayOfDigits.length; i++) {
            if (arrayOfDigits[i] % 2 != 0) {
                pairDigitsArray[j] = (int) arrayOfDigits[i];
                j++;
            }
        }
        return pairDigitsArray;
    }

    public static long getNumberOfPairsOrNotPairsFromDigitArray(long number, String parity) {
        if (parity.trim().isEmpty()) return -1L;
        if (number <= 0) return -1L;

        long[] arrayOfDigits = getArrayFromEachDigit(number);
        if (arrayOfDigits == null) return -1L;

        return getResultsForLoopThoughArrayOfDigits(arrayOfDigits);
    }

    private static long getResultsForLoopThoughArrayOfDigits(long[] arrayOfDigits) {
        int count = 0;

        for (long arrayOfDigit : arrayOfDigits) {
            if (arrayOfDigit % 2 == 0) count++;
        }

        return count;
    }

    public static long[] getArrayFromEachDigit(long number) {
        int arrayLength = getNumberLength(number);
        if (arrayLength < 0) return null;
        if (arrayLength == 0) return new long[]{0};

        long[] digitsArray = new long[arrayLength];

        for (int i = arrayLength - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number /= 10;
        }

        return digitsArray;
    }

    private static int getNumberLength(long number) {
        if (number < 0) return -1;
        if (number == 0) return 0;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
//        return (int) (Math.log10(number) + 1);
    }

    // using ArrayList and Recursion
//    private static int count = 0;
//    private static List<Long> digits = new ArrayList<>();
//
//    public static List<Long> getNumbersArray(long number) {
//        if (number > 0) {
//            count++;
//            digits.add(number % 10);
//            number /= 10;
//            getNumbersArray(number);
//            return digits;
//        }
//        return null;
//    }
}
