package com.company.Algorithms.ProblemSolving.Easy;

public class FairRations {
    private static int fairRations(int[] B) {
        int sum = 0;
        for (int i = 0; i < B.length; i++) {
            sum += B[i];
        }

        int count = 0;
        if (sum % 2 == 1) {
            return -1;
        }
        else {
            for (int i = 0; i < B.length; i++) {
                if (B[i] % 2 != 0) {
                    B[i] = B[i] + 1;
                    B[i + 1] = B[i + 1] + 1;
                    count+= 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] b = new int[] { 2, 3, 4, 5, 6 };
        System.out.println(fairRations(b));
    }
}
