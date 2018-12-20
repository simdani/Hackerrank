package com.company.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class SumTwoEquals {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 5, 3, 6, 3, 7, 3};

    }

    private static void printPairsUsingSet(int[] numbers, int n) {
        if (numbers.length < 2) {
            return;
        }
        Set set = new HashSet(numbers.length);

        for (int value : numbers) {
            int target = n - value;

            // if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.println(value + " " + target);
            }
        }
    }
}
