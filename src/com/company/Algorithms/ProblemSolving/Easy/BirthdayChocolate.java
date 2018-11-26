package com.company.Algorithms.ProblemSolving.Easy;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int r = 0;
        for (int i = 0; i < s.size(); i++) {
            sum += s.get(i);
            if (i > m - 1) {
                sum -= s.get(i - m);
            }
            if (i >= m - 1 && sum == d) {
                r++;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        int d = 3;
        int m = 2;

        System.out.println(birthday(s, d, m));
    }
}
