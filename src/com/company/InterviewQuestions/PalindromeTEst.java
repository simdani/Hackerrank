package com.company.InterviewQuestions;

public class PalindromeTEst {

    public static void main(String[] args) {
        System.out.println("is aa palindrom?:" + isPalindromeString("aaa"));
    }

    public static boolean isPalindromeString(String text) {
        String reverse = reverse(text);
        if (text.equals(reverse)) {
            return true;
        }

        return false;
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() -1));
    }
}
