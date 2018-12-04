package com.company.Algorithms.ProblemSolving.Easy;

public class MagicSquare {
    public static int formingMagicSquare(int[][] s) {
        int cost = Integer.MAX_VALUE;
        int temp = 0;

        for (int i = 0; i < s.length; i++) {

        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] s = new int[3][3];
        s[0][0] = 4;
        s[0][1] = 9;
        s[0][2] = 2;

        s[1][0] = 3;
        s[1][1] = 5;
        s[1][2] = 7;

        s[2][0] = 8;
        s[2][1] = 1;
        s[2][2] = 5;

        System.out.println(formingMagicSquare(s));
    }
}
