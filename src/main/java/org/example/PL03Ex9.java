package org.example;

public class PL03Ex9 {
    public static String getClassification(int classification) {
        int code = getClassificationCode(classification);
        if (code <= 0) return "Invalid code.";
        if (code == 1) return "Not perishable food.";
        if (code == 2) return "Perishable food.";
        if (code == 3) return "Clothing.";
        if (code == 4) return "Personal care.";
        if (code == 5) return "Cleaning and domestic appliances.";
        return "Invalid code.";
    }

    private static int getClassificationCode(int classification) {
        if (classification <= 0) return -1;
        if (classification == 1) return 1;
        if (classification <= 4) return 2;
        if (classification <= 6) return 3;
        if (classification == 7) return 4;
        if (classification <= 15) return 5;
        return 6;
    }
}
