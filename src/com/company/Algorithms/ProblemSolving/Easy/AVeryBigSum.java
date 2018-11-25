package com.company.Algorithms.ProblemSolving.Easy;

import java.io.IOException;

public class AVeryBigSum {
    static long aVeryBigNumber(long[] ar) {
        long bigNumber = 0;
        for (int i = 0; i < ar.length; i++) {
            bigNumber += ar[i];
        }
        return bigNumber;
    }

    public static void main(String[] args) throws IOException {
        int arCount = 5;
        long[] arr = new long[arCount];
        long bigNumber = 1000000001;
        for (int i = 0; i < arCount; i++) {
            arr[i] = bigNumber;
            bigNumber++;
        }

        long result = aVeryBigNumber(arr);
        System.out.println(result);
    }
}
