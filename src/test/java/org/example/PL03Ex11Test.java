package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PL03Ex11Test {
    @Test
    public void shouldReturnCorrectList() {
        int[] listOfGrades = {4, 9, 13, 17, 20};
        String[] expected = {"Bad.", "Mediocre.", "Average.", "Good.", "Very Good."};
        assertArrayEquals(expected, PL03Ex11.getStudentGrade(listOfGrades));
    }

    @Test
    public void shouldReturnCorrectListAndBreakAtMinus1() {
        int[] listOfGrades = {4, 20, 0, -1};
        String[] expected = {"Bad.", "Very Good.", "Bad.", null};
        assertArrayEquals(expected, PL03Ex11.getStudentGrade(listOfGrades));
    }

    @Test
    public void shouldReturnNullWhenThereIsAGradeBiggerThan20() {
        int[] listOfGrades = {4, 9, 13, 17, 21, 0, -1};
        assertNull(PL03Ex11.getStudentGrade(listOfGrades));
    }
}