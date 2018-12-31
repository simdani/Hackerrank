package com.company.Algorithms.ProblemSolving.Easy;

public class CamelCase {
    private static int camelcase(String s) {
        int terms = 1;
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (letter.equals(letter.toUpperCase())) {
                terms++;
            }
        }
        return terms;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
