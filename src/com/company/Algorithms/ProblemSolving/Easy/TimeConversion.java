package com.company.Algorithms.ProblemSolving.Easy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    static String TimeConversion(String s) {
        try {
            DateFormat in = new SimpleDateFormat("hh:mm:ssa");
            DateFormat out = new SimpleDateFormat("HH:mm:ss");
            Date date = in.parse(s);
            return out.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        String input = "07:05:45PM";
        System.out.println(TimeConversion(input));
    }
}
