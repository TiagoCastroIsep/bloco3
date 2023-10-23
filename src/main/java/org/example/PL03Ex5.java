package org.example;

public class PL03Ex5 {

    // palindromes
    // check if a long type number is palindrome => so I need an array of digits => validate number --- DONE
    // check if a number is an Amstrong Number => number = sum(digit^3) => so I need an array of digits --- DONE
    // return the first palindrome found --- EXTRA
    // return the first palindrome found in a given range
    // return the bigger palindrome found  in a given range
    // return the number of palindromes in a given range => validate range
    // return the first Amstrong number in a given range => validate range
    // return the qty of Amstrong numbers in a given range => validate range

    public static boolean checkCompleteNumberIsPalindrome(long number) {
        if (!getNumberValidation(number)) return false;

        long[] digitsArray = getDigitsArray(number);

        if (digitsArray == null) return false;

        for (int i = 0; i < (digitsArray.length / 2); i++) {
            if (digitsArray[i] != digitsArray[digitsArray.length - (i + 1)]) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkAmstrongNumber(long number) {
        if (!getNumberValidation(number)) return false;

        long[] digitsArray = getDigitsArray(number);

        if (digitsArray == null) return false;

        long sum = 0;
        for (long l : digitsArray) {
            sum += (long) Math.pow(l, 3);
        }

        return sum == number;
    }

    /** NOT REQUESTED for this exercise **/
    public static long[] checkFirstPalindromeFoundInNumber(long number) {
        if (!getNumberValidation(number)) return null;
        if (checkCompleteNumberIsPalindrome(number)) return null;

        long[] digitsArray = getDigitsArray(number);

        if (digitsArray == null) return null;

        long[] result = buildFirstFoundPalindrome(digitsArray);

        if (result.length <= 1) {
            return null;
        }

        return result;
    }

    private static long[] buildFirstFoundPalindrome(long[] digitsArray) {
        int[] indices = getIndicesFromPalindrome(digitsArray);
        int startIndex = indices[0];
        int endIndex = indices[1];

        long[] result = new long[endIndex - startIndex + 1];
        for (int i = 0; startIndex <= endIndex; i++) {
            result[i] = digitsArray[startIndex];
            startIndex++;
        }
        return result;
    }

    private static int[] getIndicesFromPalindrome(long[] digitsArray) {
        int[] foundIndexes = new int[2];
        boolean foundFirstPalindrome = false;

        findPalindromeIndices(digitsArray, foundFirstPalindrome, foundIndexes);

        return foundIndexes;
    }

    private static void findPalindromeIndices(long[] digitsArray, boolean foundFirstPalindrome, int[] foundIndexes) {
        int startIndex;
        int endIndex;
        for (int i = 0; i < digitsArray.length; i++) {
            if (foundFirstPalindrome) break;
            for (int j = digitsArray.length - 1; j > i; j--) {
                if (digitsArray[i] == digitsArray[j] && digitsArray[i + 1] == digitsArray[j - 1]) {
                    startIndex = i;
                    endIndex = j;
                    foundIndexes[0] = startIndex;
                    foundIndexes[1] = endIndex;

                    if (i + 1 == j) {
                        foundFirstPalindrome = true;
                        break;
                    }
                }
            }
        }
    }
    /** NOT REQUESTED for this exercise **/

    private static boolean getNumberValidation(long number) {
        return number > 0;
    }

    private static int getDigitsNumber(long number) {
        if (number < 0) return -1;
        if (number == 0) return 0;
        return (int) (Math.log10(number) + 1);
    }

    private static long[] getDigitsArray(long number) {
        int arrayLength = getDigitsNumber(number);
        if (arrayLength <= 0) return null;

        long[] digitsArray = new long[arrayLength];

        for (int i = arrayLength - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number /= 10;
        }

        return digitsArray;
    }
}
