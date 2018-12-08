package com.company.Algorithms.ProblemSolving.Easy;

public class DesigninPdfViewer {
    static int designerPdfViewer(int[] h, String word) {
        int length = word.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            char temp = word.charAt(i);
            if (max < h[temp - 97]) {
                max  = h[temp - 97];
            }
        }
        return max * length;
    }

    public static void main(String[] args) {
        String word = "abc";
        int[] b = new int[] {1, 3, 1, 3, 1, 4, 1,
                3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(designerPdfViewer(b, word));
    }
}
