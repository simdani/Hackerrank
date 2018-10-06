package com.company.Algorithms;

import java.util.Scanner;

public class StairCase {
    static void staircase(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(" ");
        }
        int padding = 0;
        for (int i = 1; i <= n; i++) {
            builder.replace(builder.length() - i,
                    builder.length() - padding, "#");
            System.out.println(builder);
            padding++;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        staircase(n);

        scanner.close();
    }
}
