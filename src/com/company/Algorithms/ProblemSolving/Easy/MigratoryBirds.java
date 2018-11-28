package com.company.Algorithms.ProblemSolving.Easy;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    static int mirgratoryBirds(List<Integer> arr) {
        int[] cloneArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            cloneArray[arr.get(i)]++;
        }
        int max = 0;
        int maxPos = 0;

        for (int i = 0 ; i < arr.size(); i++) {
            if (cloneArray[i] > max) {
                max = cloneArray[i];
                maxPos = i;
            }
        }
        return maxPos;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        System.out.println(mirgratoryBirds(arr));
    }
}
