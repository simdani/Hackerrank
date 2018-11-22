package com.company.Algorithms;

public class AppleAndOrange {
    static void countApplesAndOranges(int s, int t, int a, int b,
                                      int[] apples, int[] oranges) {
        int applesOnHouse = 0;
        for (int i = 0; i < apples.length; i++) {
            int applePositon = a + apples[i];
            if (applePositon >= s && applePositon <= t) {
                applesOnHouse++;
            }
        }
        System.out.println(applesOnHouse);

        int orangesOnHouse = 0;
        for (int i = 0; i < oranges.length; i++) {
            int orangePosition = b + oranges[i];
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }
        System.out.println(orangesOnHouse);
    }

    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int m = 3;
        int n = 2;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
