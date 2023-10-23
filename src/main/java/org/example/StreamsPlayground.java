package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsPlayground {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5};
        long[] arr2 = {5, 4, 3, 2, 1};

        /** nº de pares na array **/
        long countPair = Arrays.stream(arr).filter(el -> el % 2 == 0).count();

        /** nº de impares na array **/
        long countNotPair = Arrays.stream(arr).filter(el -> el % 2 != 0).count();

        /** somatório de pares **/
        long sumPairs = Arrays.stream(arr).filter(el -> el % 2 == 0).sum();

        /** somatório de impares **/
        long sumNotPairs = Arrays.stream(arr).filter(el -> el % 2 != 0).sum();

        /** multiplicação **/
        OptionalLong multiplication = Arrays.stream(arr).reduce((a, b) -> {
            System.out.println("value a: " + a + "  -  " + "value b: " + b);
            return a * b;
        });

        /** multiplicação de pares **/
        OptionalLong multiplicationOfPairs = Arrays.stream(arr).filter(el -> el % 2 == 0)
                .reduce((a, b) -> {
                    System.out.println("value a: " + a + "  -  " + "value b: " + b);
                    System.out.println("----------------------------------------------------------");
                    return a * b;
                });

        /** média de todos os elementos **/
        OptionalDouble average = Arrays.stream(arr).average();

        /** concatenação de Arrays **/
        long[] result = LongStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).toArray();

        System.out.println("Count Pairs: " + countPair);
        System.out.println("Count not pairs: " + countNotPair);
        System.out.println("Sum pairs: " + sumPairs);
        System.out.println("Sum not Pairs " + sumNotPairs);
        System.out.println("Average: " + average.orElse(-1));
        System.out.println("Multiply all: " + multiplication.orElse(-1));
        System.out.println("Multiply only pairs: " + multiplicationOfPairs.orElse(-1));
        System.out.println("Concatenation of arrays: " + Arrays.toString(result));
    }
}
