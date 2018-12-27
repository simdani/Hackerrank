package com.company.Algorithms.ProblemSolving.Easy;

public class StrangeCounter {
    private static long strangeCounter(long t) {
        long n = 2;

        while (3 * (n - 1) < t) {
            n = 2 * n;
        }

        return 3 * (n - 1) - t + 1;
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(4));
    }
}
