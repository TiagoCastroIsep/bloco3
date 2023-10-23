package org.example;

public class PL03Ex12 {
    // grossSalary -> 500€ tax -> 10%   :-> salaryLevel1
    // grossSalary -> 501€ to 1000€ tax -> 15%   :-> salaryLevel2
    // grossSalary -> 1001€+ tax -> 20%   :-> salaryLevel3

    public static double getEmployeeNetSalary(double grossSalary, double salaryLevel1,
                                              double salaryLevel2) {
        int validationCodes = salaryLevelValidation(salaryLevel1, salaryLevel2);
        if (validationCodes == -1) return -1;
        if (validationCodes == -2) return -2;
        if (validationCodes == -3) return -3;

        double taxRate = getGrossSalaryTaxRate(grossSalary);
        if (taxRate == -1.0) return -1;

        return grossSalary - (grossSalary * taxRate);
    }

    private static double getGrossSalaryTaxRate(double grossSalary) {
        if (grossSalary <= 0) return -1;
        /** considering that the minimum gross salary level starts at 100€ **/
        if (grossSalary < 100) return -1;
        if (grossSalary <= 500) return 0.1;
        if (grossSalary <= 1000) return 0.15;
        return 0.2;
    }

    private static int salaryLevelValidation(double salaryLevel1, double salaryLevel2) {
        /** return different codes, so we can show detailed errors later if we want to **/
        /** considering that the minimum gross salary level starts at 100€ **/
        if (salaryLevel1 < 100) return -1;
        if (salaryLevel2 <= salaryLevel1) return -2;

        /** considering that the minimum gross salary level is until 2500€ included **/
        if (salaryLevel1 >= 2500) return -3;

        /** 1 means OK **/
        return 1;
    }
}
