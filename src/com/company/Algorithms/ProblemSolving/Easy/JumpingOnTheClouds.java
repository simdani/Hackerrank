package com.company.Algorithms.ProblemSolving.Easy;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(arr));
    }


    static int jumpingOnClouds(int[] c) {
        int count = -1;
        for (int i = 0; i < c.length; i++, count++) {
            if (i < c.length - 2 && c[i + 2] == 0) {
                i++;
            }
        }
        return count;
    }
}
