package org.example;

public class PL03Ex11 {
    public static String[] getStudentGrade(int[] listOfGrades) {
        if (!validationOfInputGrades(listOfGrades)) return null;

        String[] qualitativeGrades = new String[listOfGrades.length];

        for (int i = 0; i < listOfGrades.length; i++) {
            if (listOfGrades[i] < 0) break;
            if (listOfGrades[i] >= 0 && listOfGrades[i] <= 4) qualitativeGrades[i] = "Bad.";
            if (listOfGrades[i] > 4 && listOfGrades[i] <= 9) qualitativeGrades[i] = "Mediocre.";
            if (listOfGrades[i] >= 10 && listOfGrades[i] <= 13) qualitativeGrades[i] = "Average.";
            if (listOfGrades[i] >= 14 && listOfGrades[i] <= 17) qualitativeGrades[i] = "Good.";
            if (listOfGrades[i] > 17 && listOfGrades[i] <= 20) qualitativeGrades[i] = "Very Good.";
        }
        return qualitativeGrades;
    }

    private static boolean validationOfInputGrades(int[] listOfGrades) {
        for (int grade : listOfGrades) {
            if (grade > 20) return false;
        }
        return true;
    }
}
