package com.company.Algorithms;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            total += ar[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int arr[] = new int[2];
        arr[0] = 5;
        arr[1] = 6;

        System.out.println(simpleArraySum(arr));
    }
}
