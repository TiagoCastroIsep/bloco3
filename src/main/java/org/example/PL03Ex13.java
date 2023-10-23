package org.example;

import java.util.Arrays;

public class PL03Ex13 {
    // smallWeight <= 10kg   food 100g
    // mediumWeight <= 25kg  food 250g
    // bigWeight <= 45kg     food 300g
    // giantWeight > 45kg    food 500g
    // not required to validate data entry
    public static int validateCorrectAmountOfFoodPerWeight(int animalWeight, int foodWeight) {
        int[] weightCodes = getAnimalWeightCode(animalWeight, foodWeight);

        if (weightCodes[0] == -2) return -2;
        if (weightCodes[1] == -2) return -2;

        if (weightCodes[0] == weightCodes[1]) return 0;

        return -1;
    }

    private static int[] getAnimalWeightCode(int animalWeight, int foodWeight) {
        int[] weights = new int[2];

        if (animalWeight <= 0) weights[0] = -2;
        if (animalWeight <= 10 && animalWeight > 0) weights[0] = 1;
        if (animalWeight <= 25 && animalWeight > 10) weights[0] = 2;
        if (animalWeight <= 45 && animalWeight > 25) weights[0] = 3;
        if (animalWeight > 45) weights[0] = 4;

        if (foodWeight <= 0) weights[1] = -2;
        if (foodWeight <= 100 && foodWeight > 0) weights[1] = 1;
        if (foodWeight <= 250 && foodWeight > 100) weights[1] = 2;
        if (foodWeight <= 300 && foodWeight > 250) weights[1] = 3;
        if (foodWeight <= 500 && foodWeight > 300) weights[1] = 4;

        return weights;
    }

//    public static int[] getRandomAnimals() {
//        double animalWeight = Math.random() * 10 * 5;
//        double foodWeight = Math.random() * 100 * 5;
//
//        int count = 10;
//        int[] response = new int[10];
//
//        while (count > 0) {
//            int codes = validateCorrectAmountOfFoodPerWeight((int) animalWeight, (int) foodWeight);
//            response[count - 1] = codes;
//            count--;
//        }
//
//        return response;
//    }
}
