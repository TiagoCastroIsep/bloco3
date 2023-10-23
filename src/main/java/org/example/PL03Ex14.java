package org.example;

import java.util.Arrays;

public class PL03Ex14 {
    public static int getIdentityNumberValidation(int number) {
        if (!validateInputNumber(number)) return -1;

        int[] digitsArray = getArrayOfDigitsFromNumber(number);
        double weightedSum = weightedSumCalculation(digitsArray);

        if (weightedSum % 11 == 0) return 1;

        return -1;
    }

    private static int weightedSumCalculation(int[] digitsArray) {
        /** first grabbing a copy of the last digit **/
        int[] addedLastDigit = Arrays.copyOf(digitsArray, digitsArray.length + 1);
        addedLastDigit[addedLastDigit.length - 1] = digitsArray[digitsArray.length - 1];

        int multiplier = 1;
        for (int i = addedLastDigit.length - 1; i >= 0; i--) {
            addedLastDigit[i] *= multiplier;
            multiplier++;
        }

        return Arrays.stream(addedLastDigit).sum();
    }

    private static int[] getArrayOfDigitsFromNumber(int number) {
        int arrayLength = getNumberOfDigitsInNumber(number);

        int[] digitsArray = new int[arrayLength];

        for (int i = arrayLength - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number /= 10;
        }

        return digitsArray;
    }

    private static int getNumberOfDigitsInNumber(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    private static boolean validateInputNumber(int number) {
        if (number <= 0) return false;
        int numberOfDigits = getNumberOfDigitsInNumber(number);
        return numberOfDigits <= 8;
    }
}
