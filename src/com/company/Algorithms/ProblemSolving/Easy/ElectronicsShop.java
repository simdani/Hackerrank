package com.company.Algorithms.ProblemSolving.Easy;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards,
                             int[] drives,
                             int b) {
        int amount = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if ((keyboards[i] + drives[j] <= b &&
                        (keyboards[i] + drives[j] > amount))) {
                    amount = keyboards[i] + drives[j];
                }
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        int b = 10;
        int n = 2;
        int m = 3;

        int[] keyboards = new int[] { 3, 1};
        int[] drives = new int[] { 5, 2, 8};

        System.out.println(getMoneySpent(keyboards, drives, b));
    }
}
