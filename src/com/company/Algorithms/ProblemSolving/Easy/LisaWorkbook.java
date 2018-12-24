package com.company.Algorithms.ProblemSolving.Easy;

public class LisaWorkbook {
    private static int workbook(int n, int k, int[] arr) {
        int page = 1;
        int count = 0;

        for (int a : arr) {
            for (int i = 1; i <= a; i++) {
                if (i == page) count++;
                if (i % k == 0) page++;
            }
            if (a % k != 0) page++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int[] arr = new int[] { 4, 2, 6, 1, 10 };

        System.out.println(workbook(n, k, arr));
    }
}
