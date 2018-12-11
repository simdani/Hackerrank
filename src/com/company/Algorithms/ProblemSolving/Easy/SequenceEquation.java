package com.company.Algorithms.ProblemSolving.Easy;

public class SequenceEquation {
    private static int[] permutationEquation(int[] p) {
        int[] q = new int[p.length];

        for (int i : p) {
            q[p[p[i-1]-1]-1] = i;
        }

        return q;
    }

    public static void main(String[] args) {
        int[] initial = new int[] { 2, 3, 1};

        int[] result = permutationEquation(initial);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
