package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex13Test {
    @Test
    public void shouldReturnCorrectValueForSmallWeight() {
        int animalWeight = 10;
        int foodWeight = 100;
        int expected = 0;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnCorrectValueForMediumWeight() {
        int animalWeight = 25;
        int foodWeight = 250;
        int expected = 0;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnCorrectValueForBigWeight() {
        int animalWeight = 45;
        int foodWeight = 300;
        int expected = 0;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnCorrectValueForGiantWeight() {
        int animalWeight = 46;
        int foodWeight = 500;
        int expected = 0;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnMinus1ForUnbalancedFoodWeightSmallWeight() {
        int animalWeight = 10;
        int foodWeight = 250;
        int expected = -1;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnMinus1ForUnbalancedFoodWeightMediumWeight() {
        int animalWeight = 25;
        int foodWeight = 300;
        int expected = -1;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnMinus1ForUnbalancedFoodWeightBigWeight() {
        int animalWeight = 45;
        int foodWeight = 500;
        int expected = -1;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnMinus1ForUnbalancedFoodWeightGiantWeight() {
        int animalWeight = 46;
        int foodWeight = 300;
        int expected = -1;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnMinus1ForAnimalWeightLessThanZero() {
        int animalWeight = -1;
        int foodWeight = 100;
        int expected = -2;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }

    @Test
    public void shouldReturnMinus1ForFoodWeightLessThanZero() {
        int animalWeight = 10;
        int foodWeight = -100;
        int expected = -2;
        assertEquals(expected, PL03Ex13.validateCorrectAmountOfFoodPerWeight(animalWeight, foodWeight));
    }
}