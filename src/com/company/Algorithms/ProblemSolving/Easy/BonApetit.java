package com.company.Algorithms.ProblemSolving.Easy;

import java.util.ArrayList;
import java.util.List;

public class BonApetit {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;

        for (int i = 0; i < bill.size(); i++) {
            int price = bill.get(i);
            if (i != k) {
                total += price;
            }
        }
        int charged = b;
        System.out.println(total / 2 == charged ? "Bon Appetit" :
                charged - total / 2);
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int b = 12;
        bonAppetit(bill, k, b);
    }
}
