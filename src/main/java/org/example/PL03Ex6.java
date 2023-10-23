package org.example;

import java.util.Arrays;

public class PL03Ex6 {
    // extraHourPrice = grossSalary * 1.02
    // return [] of [grossSalary, totalExtraHoursSalary]
    public static double[] runEmployeeTotalSalaryCalculation(double grossSalary, double extraHourPricePercentage,
                                                             double extraHoursQuantityLastMonth) {
        int validationCode = getInputsValidationCodes(grossSalary, extraHourPricePercentage, extraHoursQuantityLastMonth);
        if (validationCode < 0) return null;

        double extraHoursCost = getExtraHoursCostFromLastMonth(grossSalary, extraHourPricePercentage, extraHoursQuantityLastMonth);

        return new double[] {grossSalary + extraHoursCost, extraHoursCost};
    }

    private static double getExtraHoursCostFromLastMonth(double grossSalary, double extraHourPricePercentage,
                                                         double extraHoursQuantityLastMonth) {
        double extraHourPrice = grossSalary * (extraHourPricePercentage / 100);
        return extraHourPrice * extraHoursQuantityLastMonth;
    }

    private static int getInputsValidationCodes(double grossSalary, double extraHourPricePercentage,
                                                double extraHoursQuantityLastMonth) {
        if (grossSalary <= 0) return -1;
        if (extraHourPricePercentage <= 0) return -2;
        if (extraHourPricePercentage > 100) return -3;
        if (extraHoursQuantityLastMonth < 0) return -4;
        if (extraHourPricePercentage > 120) return -5;
        return 1;
    }
}
