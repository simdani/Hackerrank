package com.company.Algorithms.ProblemSolving.Easy;

import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int[] counting = new int[100];
        int temp;

        for (Integer anA : a) {
            if (anA == 0) {
                counting[0]++;
            } else {
                counting[anA]++;
                counting[anA - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (Integer i: a) {
            if (counting[i] > max) {
                max = counting[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);

        System.out.println(pickingNumbers(numbers));
    }
}
