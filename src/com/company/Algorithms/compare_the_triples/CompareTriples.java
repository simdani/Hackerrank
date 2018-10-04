package com.company.Algorithms.compare_the_triples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CompareTriples {
    // complete the function
    static List<Integer> compareTriples(List<Integer> a, List<Integer> b)
    {
        return a;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(8);

        List<Integer> result =compareTriples(a, b);

        for (Integer res : result) {
            System.out.println(res);
        }
    }
}
