package com.company.Algorithms.ProblemSolving.Medium;

public class TheTimeInWords {
    private static String timeInWords(int h, int m) {
        String[] hours = {"","one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve "};
        String[] minutes = {"o' clock", "one minute ","two minutes ", "three minutes ", "four minutes ", "five minutes ", "six minutes ", "seven minutes ","eight minutes ", "nine minutes ","ten minutes ", "eleven minutes ","twelve minutes ", "thirteen minutes ","fourteen minutes ","quarter ", "sixteen minutes ", "seventeen minutes ", "eighteen minutes ", "ninteen minutes ", "twenty minutes ","twenty one minutes ", "twenty two minutes ","twenty three minutes ", "twenty four minutes ","twenty five minutes ", "twenty six minutes ", "twenty seven minutes ","twenty eight minutes ", "twenty nine minutes ","half "};

        String time = "";
        if (m == 0)
            time = hours[h] + minutes[m];
        else if (m == 15)
            time = minutes[m] + "past " + hours[h];
        else if (m == 30)
            time = minutes[m] + "past " + hours[h];
        else if (m == 45)
            time = minutes[15] + "to " + hours[h + 1];
        else if (m < 30)
            time = minutes[m] + "past " + hours[h];
        else if (m > 30)
            time = minutes[60 - m] + "to " + hours[h + 1];

        return time;
    }

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 47));
    }
}
