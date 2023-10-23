package org.example;

public class PL03Ex10 {
    public static double getExchangeFromEuro(String currencySymbol, double amount) {
        if (amount <= 0) return -1;
        double exchangeRate = getExchangeRateFromSelectedCurrency(currencySymbol.toUpperCase());
        if (exchangeRate == -1) return -1;
        return amount * exchangeRate;
    }

    private static double getExchangeRateFromSelectedCurrency(String currencySymbol) {
        if (currencySymbol.equals("D")) return 1.534;
        if (currencySymbol.equals("L")) return 0.774;
        if (currencySymbol.equals("I")) return 161.480;
        if (currencySymbol.equals("C")) return 9.593;
        if (currencySymbol.equals("F")) return 1.601;
        return -1;
    }
}
