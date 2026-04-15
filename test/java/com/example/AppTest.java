package com.student;

public class App {

    public static double calculateAverage(double total, int subjects) {
        return total / subjects;
    }

    public static String calculateGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }
}
