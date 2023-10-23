package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex9Test {
    @Test
    public void shouldReturnNotPerishableFood() {
        int classification = 1;
        String expected = "Not perishable food.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnPerishableFoodMinLimit() {
        int classification = 2;
        String expected = "Perishable food.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnPerishableFoodMaxLimit() {
        int classification = 4;
        String expected = "Perishable food.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnClothingMinLimit() {
        int classification = 5;
        String expected = "Clothing.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnClothingMaxLimit() {
        int classification = 6;
        String expected = "Clothing.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnPersonalCare() {
        int classification = 7;
        String expected = "Personal care.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnCleaningAndDomesticAppliancesMinLimit() {
        int classification = 8;
        String expected = "Cleaning and domestic appliances.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnCleaningAndDomesticAppliancesMaxLimit() {
        int classification = 15;
        String expected = "Cleaning and domestic appliances.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnInvalidCodeMinLimit() {
        int classification = -1;
        String expected = "Invalid code.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }

    @Test
    public void shouldReturnInvalidCodeMaxLimit() {
        int classification = 16;
        String expected = "Invalid code.";
        assertEquals(expected, PL03Ex9.getClassification(classification));
    }
}