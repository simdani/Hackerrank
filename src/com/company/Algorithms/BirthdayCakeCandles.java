package com.company.Algorithms;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        int tallest = 0;
        int frequency = 0;

        for (int i = 0; i < ar.length; i++) {
            int height = ar[i];

            if (height > tallest) {
                tallest = height;
                frequency = 1;
            }
            else if (height == tallest) frequency++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(arr));
    }
}
