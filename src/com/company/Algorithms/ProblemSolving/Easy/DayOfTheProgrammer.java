package com.company.Algorithms.ProblemSolving.Easy;

public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {
        if (year == 1918) return "26.09.1918";
        if (isLeapYear(year)) return "12.09." + year;
        else return "13.09." + year;
    }

    static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        return year <= 1918 || !(year % 100 == 0 & year % 400 != 0);
    }

    public static void main(String[] args) {
        int year = 2017;

        System.out.println(dayOfProgrammer(year));
    }
}
