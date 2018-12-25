package com.company.Algorithms.ProblemSolving.Easy;

public class HalloweenSale {
    private static int howManyGames(int p, int d, int m, int s) {
        int total = 0;
        while (s >= p) {
            total++;
            s -= p;
            p = Math.max(p - d, m);
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80));
    }
}
