package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex10Test {
    double dollar;
    double pound;
    double yen;
    double swedishCrown;

    double swissFranc;

    @BeforeEach
    public void setup() {
        dollar = 1.534;
        pound = 0.774;
        yen = 161.480;
        swedishCrown = 9.593;
        swissFranc = 1.601;
    }

    @Test
    public void shouldReturnCorrectValueForDollar() {
        double amount = 500.0;
        String currencySymbol = "d";
        double expected = 500.0 * dollar;
        assertEquals(expected, PL03Ex10.getExchangeFromEuro(currencySymbol, amount), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForPound() {
        double amount = 500.0;
        String currencySymbol = "L";
        double expected = 500.0 * pound;
        assertEquals(expected, PL03Ex10.getExchangeFromEuro(currencySymbol, amount), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForIene() {
        double amount = 500.0;
        String currencySymbol = "I";
        double expected = 500.0 * yen;
        assertEquals(expected, PL03Ex10.getExchangeFromEuro(currencySymbol, amount), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForSwedishCrown() {
        double amount = 500.0;
        String currencySymbol = "c";
        double expected = 500.0 * swedishCrown;
        assertEquals(expected, PL03Ex10.getExchangeFromEuro(currencySymbol, amount), 0.01);
    }

    @Test
    public void shouldReturnCorrectValueForSwissFranc() {
        double amount = 500.0;
        String currencySymbol = "f";
        double expected = 500.0 * swissFranc;
        assertEquals(expected, PL03Ex10.getExchangeFromEuro(currencySymbol, amount), 0.01);
    }

    @Test
    public void shouldReturnMinus1ForNoneOfThePossibleLetters() {
        double amount = 500.0;
        String currencySymbol = "1";
        double expected = -1;
        assertEquals(expected, PL03Ex10.getExchangeFromEuro(currencySymbol, amount), 0.01);
    }

    @Test
    public void shouldReturnMinus1IfAmountIsLessOrEqualsZero() {
        double amount = -0.1;
        String currencySymbol = "f";
        double expected = -1;
        assertEquals(expected, PL03Ex10.getExchangeFromEuro(currencySymbol, amount), 0.01);
    }
}