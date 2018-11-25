package com.company.Algorithms.ProblemSolving.Easy;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        float positive = 0;
        float negative = 0;
        float zeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] == 0) {
                zeros++;
            } else {
                negative++;
            }
        }

        if (positive == 0) {
            System.out.println(positive);
        }
        else {
            System.out.println(positive / arr.length);
        }

        if (negative == 0) {
            System.out.println(negative);
        }
        else {
            System.out.println(negative / arr.length);
        }

        if (zeros == 0) {
            System.out.println(zeros);
        }
        else {
            System.out.println(zeros / arr.length);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }
}
