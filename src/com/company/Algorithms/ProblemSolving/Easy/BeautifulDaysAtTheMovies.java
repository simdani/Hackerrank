package com.company.Algorithms.ProblemSolving.Easy;

import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for(int a = i;a<j+1;a++)
        {
            int d= a-reverse(a);
            if(d%k==0)
                count++;
        }
        return count;
    }

    private static int reverse(int a)
    {
        int reverse = 0;
        while(a!=0)
        {
            reverse = reverse * 10;
            reverse = reverse + a%10;
            a = a/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
}
