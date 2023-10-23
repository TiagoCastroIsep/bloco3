package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex6Test {
    @Test
    public void shouldReturnCorrectArrayForValidInputs() {
        double grossSalary = 500.0;
        double extraHourPricePercentage = 2.0;
        double extraHoursQuantityLastMonth = 50.5;
        double[] result = new double[] { 1005.0, 505.0};
        assertArrayEquals(result, PL03Ex6.runEmployeeTotalSalaryCalculation(grossSalary, extraHourPricePercentage,
                extraHoursQuantityLastMonth));
    }

    @Test
    public void shouldReturnNullForGrossSalaryLessOrEqualsZero() {
        double grossSalary = 0.0;
        double extraHourPricePercentage = 2.0;
        double extraHoursQuantityLastMonth = 50.5;
        assertNull(PL03Ex6.runEmployeeTotalSalaryCalculation(grossSalary, extraHourPricePercentage,
                extraHoursQuantityLastMonth));
    }

    @Test
    public void shouldReturnNullForExtraHourPricePercentageLessOrEqualsZero() {
        double grossSalary = 500.0;
        double extraHourPricePercentage = 0.0;
        double extraHoursQuantityLastMonth = 50.5;
        assertNull(PL03Ex6.runEmployeeTotalSalaryCalculation(grossSalary, extraHourPricePercentage,
                extraHoursQuantityLastMonth));
    }

    @Test
    public void shouldReturnNullForExtraHoursQuantityLastMonthLessThanZero() {
        double grossSalary = 500.0;
        double extraHourPricePercentage = 0.0;
        double extraHoursQuantityLastMonth = -0.1;
        assertNull(PL03Ex6.runEmployeeTotalSalaryCalculation(grossSalary, extraHourPricePercentage,
                extraHoursQuantityLastMonth));
    }

    @Test
    public void shouldReturnNullForExtraHoursQuantityLastMonthMoreThan120() {
        double grossSalary = 500.0;
        double extraHourPricePercentage = 0.0;
        double extraHoursQuantityLastMonth = 121;
        assertNull(PL03Ex6.runEmployeeTotalSalaryCalculation(grossSalary, extraHourPricePercentage,
                extraHoursQuantityLastMonth));
    }
}