package com.company.Algorithms.ProblemSolving.Easy;

import java.util.Arrays;

public class HurdleRace {
    static int hurdleRace(int k, int[] height) {
        int max = Arrays.stream(height).max().orElse(0);
        if (max > k) {
            return max - k;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[] { 1, 6, 3, 5, 2 };
        System.out.println(hurdleRace(4, ar));
    }
}
