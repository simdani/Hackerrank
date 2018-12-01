package com.company.Algorithms.ProblemSolving.Easy;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar[i])) {
                colors.add(ar[i]);
            } else {
                pairs++;
                colors.remove(ar[i]);
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(n, ar));
    }
}
