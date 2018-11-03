package com.company.Algorithms;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        long max = arr[0];
        long min = arr[0];
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (max > arr[i]) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            else {
                max = arr[i];
            }
        }

        System.out.println((total - max) + " " + (total - min));
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        miniMaxSum(arr);
    }
}
