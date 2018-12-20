package com.company.InterviewQuestions;

public class RemoveCharFromString {
    public static void main(String[] args) {
        System.out.println(remove("abcdef", 'b'));
    }

    public static String remove(String word, char unwanted) {
        StringBuilder sb = new StringBuilder();
        char[] letters = word.toCharArray();

        for (char c : letters) {
            if (c != unwanted) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String removeRecursive(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        return removeRecursive(word.substring(0, index) + word.substring(index + 1, word.length()), ch);
    }
}
