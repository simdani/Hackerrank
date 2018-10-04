package com.company.Algorithms.compare_the_triples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CompareTriples {
    // complete the function
    static List<Integer> compareTriples(List<Integer> a, List<Integer> b)
    {
        List<Integer> result = new ArrayList<>();
        int aliceCount = 0;
        int bobCount = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceCount++;
            }
            else if (a.get(i) < b.get(i)) {
                bobCount++;
            }
        }

        result.add(aliceCount);
        result.add(bobCount);
        return result;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);

        List<Integer> result =compareTriples(a, b);

        for (Integer res : result) {
            System.out.println(res);
        }
    }
}
