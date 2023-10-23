package org.example;

public class PL03Ex7 {
    public static int runArrayLookupForSumOfElementsBiggerThanN(int[] nums, int n) {
        boolean validated = getInputValidation(nums, n);

        if (!validated) return -1;

        return getPositionWhereSumIsBiggerThanN(nums, n);
    }

    private static boolean getInputValidation(int[] nums, int n) {
        int nUpperLimit = 1000000000;

        if (n < 0) return false;
        if (n >= nUpperLimit) return false;

        int count = 0;
        for (int num : nums) {
            if (num <= 0) return false;
            if (num == 1) count++;
        }

        if (count == nums.length && n >= 1) return false;

        return true;
    }

    private static int getPositionWhereSumIsBiggerThanN(int[] nums, int n) {
        int currentPosition = -2;
        for (int i = 0, multiply = 1; i < nums.length; i++) {
            multiply *= nums[i];
            if (multiply > n) {
                currentPosition = i;
                break;
            }
        }
        return currentPosition;
    }
}
