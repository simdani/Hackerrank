package com.company.Algorithms.ProblemSolving.Easy;

public class CountingValleys {
    static int countingValleys(int n, String s) {
        int valleys = 0;
        int currentLevel = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') ++currentLevel;
            if (c == 'D') --currentLevel;

            if (currentLevel == 0 && c == 'U') {
                ++valleys;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8,
                "UDDDUDUU"));
    }
}
