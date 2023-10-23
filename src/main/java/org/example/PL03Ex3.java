package org.example;

public class PL03Ex3 {
    // sum of pairs or not pairs in a range --- DONE
    // qty of pairs in a range --- DONE
    // sum of all multiples in a given range both numbers might not be in the same order --- DONE
    // product of all multiples in a given range --- DONE
    // average of given multiples X and Y in a range defined by two numbers. --- DONE

    /** START - AVERAGE OF MULTIPLES **/
    public static int getAverageOfAllFoundMultiples(int n, int a, int b) {
        int validationCodes = validateLimits(a, b);

        if (validationCodes == -1 || validationCodes == -4) return 1;

        int sumOfMultipleElements = getSumOfAllFoundMultiples(n, a, b);

        int[] indexes = getIndexesFromValidationCodes(a, b);

        int startIndex = indexes[0];
        int endIndex = indexes[1];

        int totalMultiplesArrayLength = getArraySizeForFoundMultiples(n, startIndex, endIndex);

        return sumOfMultipleElements / totalMultiplesArrayLength;
    }
    /** END - AVERAGE OF MULTIPLES **/

    /** START - PRODUCT OF MULTIPLES **/
    public static int getProductOfAllFoundMultiples(int n, int a, int b) {
        /** if we multiply any number to zero, result is zero **/
        if (n == 0 || a == 0) return 0;

        /** avoiding overflow issue **/
        if (a > 19 || b > 19) return -2;

        int[] arrayOfMultiples = getArrayOfAllMultiplesOfNumN(n, a, b);

        if (arrayOfMultiples == null) return -1;

        int prod = 1;
        for (int element : arrayOfMultiples) {
            prod *= element;
        }

        return prod;
    }
    /** END - PRODUCT OF MULTIPLES **/

    /** START - SUM OF MULTIPLES **/
    public static int getSumOfAllFoundMultiples(int n, int a, int b) {
        int[] arrayOfMultiples = getArrayOfAllMultiplesOfNumN(n, a, b);

        if (arrayOfMultiples == null) return -1;

        int sum = 0;
        for (int element : arrayOfMultiples) {
            sum += element;
        }

        return sum;
    }
    /** END - SUM OF MULTIPLES **/

    /** START - MULTIPLES UTILS **/
    private static int[] getArrayOfAllMultiplesOfNumN(int n, int a, int b) {
        int validationCode = validateLimits(a, b);

        if (validationCode == -1) return null;
        if (validationCode == -4) return new int[] {a};

        int[] indexes = getIndexesFromValidationCodes(a, b);

        int startIndex = indexes[0];
        int endIndex = indexes[1];

        int arrayLengthForPairsFound;

        if (n == 0) {
            arrayLengthForPairsFound = endIndex - startIndex + 1;
        } else {
            arrayLengthForPairsFound = getArraySizeForFoundMultiples(n, startIndex, endIndex);
        }

        return buildArrayOfAllMultiples(n, startIndex, endIndex, arrayLengthForPairsFound);
    }

    private static int[] buildArrayOfAllMultiples(int n, int startIndex, int endIndex, int arrayLength) {
        int[] multiples = new int[arrayLength];

        if (n != 0) {
            for (int i = startIndex, j = 0; i <= endIndex; i++) {
                if (i % n == 0) {
                    multiples[j] = i;
                    j++;
                }
            }
            return multiples;
        }

        for (int i = startIndex, j = 0; i <= endIndex; i++) {
            multiples[j] = i;
            j++;
        }

        return multiples;
    }
    /** END - MULTIPLES UTILS **/

    /** START - SUM OF PAIRS OR SUM OF NOT PAIRS**/
    public static int getSumOfPairOrNotPairInRange(int a, int b, String parity) {
        if (parity.isEmpty()) return -1;
        int[] requestedArray = getAllRequestedParityElementsInRange(a, b, parity);
        if (requestedArray == null) return -1;

        int sum = 0;

        for (int element : requestedArray) {
            sum += element;
        }

        return sum;
    }
    /** END - SUM OF PAIRS OR SUM OF NOT PAIRS**/

    /** START - PAIRS OR NOT PAIRS UTILS **/
    private static int[] getAllRequestedParityElementsInRange(int a, int b, String parity) {
        int arrayLength = getNumberOfPairsFromGivenRange(a, b);

        if (arrayLength == 0) return null;
        if (arrayLength < 0) return null;

        return loopThroughElementsMatchingParity(a, b, arrayLength, parity);
    }

    private static int[] loopThroughElementsMatchingParity(int a, int b, int arrayLength, String parity) {
        if (arrayLength == 1) return new int[]{a};
        if (arrayLength <= 0) return null;

        int[] parityMatchingElements = new int[arrayLength];

        int[] indexes = getIndexesFromValidationCodes(a, b);
        int startIndex = indexes[0];
        int endIndex = indexes[1];

        if (parity.toLowerCase().trim().equals("pair")) {
            for (int i = startIndex, j = 0; i <= endIndex; i++) {
                if (i % 2 == 0) {
                    parityMatchingElements[j] = i;
                    j++;
                }
            }
            return parityMatchingElements;
        }

        for (int i = startIndex, j = 0; i <= endIndex; i++) {
            if (i % 2 != 0) {
                parityMatchingElements[j] = i;
                j++;
            }
        }
        return parityMatchingElements;
    }


    private static int getNumberOfPairsFromGivenRange(int a, int b) {
        int numberOfPairs = 0;

        int validationCode = validateLimits(a, b);

        if (validationCode == -1) return 1;
        if (validationCode == -4) return 1;

        int[] indexes = getIndexesFromValidationCodes(a, b);
        int startIndex = indexes[0];
        int endIndex = indexes[1];

        for (int i = startIndex; i <= endIndex; i++) {
            if (i % 2 == 0) numberOfPairs++;
        }

        return numberOfPairs;
    }
    /** END - PAIRS OR NOT PAIRS UTILS **/

    /** START - VALIDATIONS AND UTILS **/
    private static int validateLimits(int a, int b) {
        /** return codes for: *-> a == 0 && a == b (-1)   *-> a < b  (-2)  *-> b < a (-3)  * -> a == b (-4) **/
        if (a == 0 && b == 0) return -1;
        if (a == b) return -4;
        if (a < b) return -2;
        return -3;
    }

    private static int[] getIndexesFromValidationCodes(int a, int b) {
        int startIndex;
        int endIndex;

        int validationCode = validateLimits(a, b);

        if (validationCode == -1) return new int[] {1};

        if (validationCode == -4) return new int[] {0};

        if (validationCode == -2) {
            startIndex = a;
            endIndex = b;
        } else {
            startIndex = b;
            endIndex = a;
        }

        return new int[] { startIndex, endIndex };
    }

    private static int getArraySizeForFoundMultiples(int n, int startIndex, int endIndex) {
        if (n == 0) return endIndex - startIndex;

        int lengthForFoundPairs = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            if (i % n == 0) lengthForFoundPairs++;
        }

        return lengthForFoundPairs;
    }
    /** END - VALIDATIONS AND UTILS **/
}
