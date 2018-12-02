package com.company.Algorithms.ProblemSolving.Easy;

public class DrawingBook {
    static int pageCount(int n, int p) {
        int result = 0;
        int front = p / 2;
        int back = n / 2 - p / 2;
        if (front < back) {
            result = front;
        } else {
            result = back;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
    }
}
