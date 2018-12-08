package com.company.Algorithms.ProblemSolving.Easy;

import java.util.HashMap;
import java.util.Map;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairCount = 0;
        Map<Integer, Integer> buckets = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = ar[i];
            num %= k;

            int complement = (k - num) % k;
            Integer count = buckets.get(complement);
            if (count != null) {
                pairCount += count;
            }

            count = buckets.get(num);
            if (count == null) {
                buckets.put(num, 1);
            } else {
                buckets.put(num, count + 1);
            }
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
