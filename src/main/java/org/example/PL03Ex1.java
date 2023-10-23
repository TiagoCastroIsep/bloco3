package org.example;

public class PL03Ex1 {
    public static int factorialSolution(int num) {
        /** factorial is only for non-negative integers **/
        if (num < 0) return -1;

        /** integer overflow limit at num >= 20 **/
        if (num >= 20) return -2;

        /** when num == 0, the for loop doesn't run and returns the correct value automatically **/
        int res = 1;
        for (int x = num; x >= 1; x--) {
            res *= x;
        }

        return res;
    }
}
