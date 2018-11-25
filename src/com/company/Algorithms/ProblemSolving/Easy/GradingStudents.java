package com.company.Algorithms.ProblemSolving.Easy;

public class GradingStudents {
    static int[] gradingStudents(int[] grades) {
        int[] calculatedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38 || grades[i] % 5 < 3) {
                calculatedGrades[i] = grades[i];
            } else {
                calculatedGrades[i] = grades[i] + (5 - (grades[i] % 5));
            }
        }
        return calculatedGrades;
    }

    public static void main(String[] args) {
        int[] grades = { 73, 67, 38, 33};
        int[] calculateGrades = gradingStudents(grades);
        for (int calculateGrade : calculateGrades) {
            System.out.println(calculateGrade);
        }
    }
}
