package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex12Test {
    double salaryLevel1;
    double salaryLevel2;

    @BeforeEach
    public void setup() {
        salaryLevel1 = 500.0;
        salaryLevel2 = 1000.0;
    }

    @Test
    public void shouldReturnCorrectValueForLowerSalaryLevelLowerBound() {
        double grossSalary = 100.0;
        double expected = 90.0;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForLowerSalaryLevelUpperBound() {
        double grossSalary = 500.0;
        double expected = 450.0;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForMidSalaryLevelLowerBound() {
        double grossSalary = 501.0;
        double expected = 425.85;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForMidSalaryLevelUpperBound() {
        double grossSalary = 1000.0;
        double expected = 850.0;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForHighSalaryLevelLowerBound() {
        double grossSalary = 1001.0;
        double expected = 800.80;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnMinus1ForGrossSalaryLessOrEqualsZero() {
        double grossSalary = 0;
        double expected = -1;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnMinus1ForGrossSalaryLessThan100() {
        double grossSalary = 99;
        double expected = -1;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnMinus1ForGrossSalaryLevelLessThan100() {
        double grossSalary = 99;
        double expected = -1;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, salaryLevel1, salaryLevel2), 0.01);
    }

    @Test
    public void shouldReturnMinus2ForGrossSalaryLevel2LessOrEqualsToGrossSalaryLevel1() {
        double grossSalary = 101;
        double level1 = 500.0;
        double level2 = 500.0;
        double expected = -2;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, level1, level2), 0.01);
    }

    @Test
    public void shouldReturnMinus3ForGrossSalaryLevel1BiggerOrEqualsTo2500() {
        double grossSalary = 101;
        double level1 = 2500.0;
        double level2 = 5000.0;
        double expected = -3;
        assertEquals(expected, PL03Ex12.getEmployeeNetSalary(grossSalary, level1, level2), 0.01);
    }
}