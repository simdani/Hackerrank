package com.company.Algorithms.ProblemSolving.Easy;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairCount = 0;
        int[] remainderCountList = new int[k];

        for (int i = 0; i < ar.length; i++) {
            int remainder =  ar[i] % k;
            remainderCountList[remainder]++;
        }
        int exactCount = remainderCountList[0];
        pairCount += (exactCount * (exactCount - 1)) / 2;

        for (int i = 1; i <= k / 2 && i != k - 1; i++) {
            pairCount += remainderCountList[i] * remainderCountList[k - 1];
        }

        if (k % 2 == 0) {
            int halfCount = remainderCountList[k / 2];
            pairCount += (halfCount * (halfCount - 1)) / 2;
        }

        return pairCount;
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        int[] ar = new int[] { 1, 3, 2, 6, 1, 2};

        System.out.println(divisibleSumPairs(n, k, ar));
    }
}
