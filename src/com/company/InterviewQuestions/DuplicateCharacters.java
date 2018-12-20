package com.company.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {

    }

    private static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // iterate through hash map to print all duplicate characters of string
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.println("list of duplicate characters in string " + word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
