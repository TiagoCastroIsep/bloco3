package org.example;

public class PL03Ex16 {
    public static int numberClassification(int number) {
        if (number <= 0) return 2;

        int[] divisorsArray = getDivisorsArray(number);

        int sum = getSumOfAllArrayValues(divisorsArray);

        if (number == sum) return 0;
        if (number < sum) return 1;

        return -1;
    }

    private static int getDivisorsCount(int number) {
        /** number 1 is divisor of every int **/
        int count = 1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int[] getDivisorsArray(int number) {
        int arrayLength = getDivisorsCount(number);
        int[] array = new int[arrayLength - 1];

        for (int i = 1, j = 0; i < number; i++) {
            if (number % i == 0) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    private static int getSumOfAllArrayValues(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
