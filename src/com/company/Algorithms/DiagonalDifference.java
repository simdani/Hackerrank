package com.company.Algorithms;

public class DiagonalDifference {
    private static int diagonalDifference(int[][] arr) {
        int start = 0;
        int end = arr.length - 1;

        int startSum = 0;
        int endSum = 0;

        for (int[] anArr : arr) {
            for (int j = 0; j < anArr.length; j++) {
                if (j == start) {
                    startSum += anArr[j];
                }
                if (j == end) {
                    endSum += anArr[j];
                }
            }
            start += 1;
            end -= 1;
        }

        return Math.abs(startSum - endSum);
    }

    public static void main(String[] args) {
        int n = 3;
        int arr[][] = new int[n][n];
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 4;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        arr[2][0] = 10;
        arr[2][1] = 8;
        arr[2][2] = -12;

        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
