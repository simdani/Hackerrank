package com.company.Algorithms.ProblemSolving.Easy;

public class CatsAndMouse {

    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x - z) < Math.abs(y - z)) {
            return "Cat A";
        } else if (Math.abs(x - z) > Math.abs(y - z)) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) {

        System.out.println(catAndMouse(1, 2, 3));
    }
}
