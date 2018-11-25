package com.company.Algorithms.ProblemSolving.Easy;

public class BreakingRecords {
    static int[] breakingRecords(int[] scores) {
        int lowest, highest;
        lowest = highest = scores[0];

        int[] result = new int[2];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
                ++result[0];
            } else if (scores[i] < lowest) {
                lowest = scores[i];
                ++result[1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] scores = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
        int[] finalScores = breakingRecords(scores);

        for (int score : finalScores) {
            System.out.println(score);
        }
    }
}
