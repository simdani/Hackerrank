package com.company.Algorithms.ProblemSolving.Easy;

public class ViralAdvertising {
    private static int viralAdvertising(int n) {
        int people = 5;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            people = (int) Math.floor(people / 2);
            sum += people;
            people *= 3;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }
}
