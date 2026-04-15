package com.student;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        double total = 0;

        // Input marks
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            total += marks;
        }

        // Calculate average
        double average = total / subjects;

        // Determine grade
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output result
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("after modify";)

        scanner.close();
    }
}
