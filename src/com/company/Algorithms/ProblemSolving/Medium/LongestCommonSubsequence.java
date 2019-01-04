package com.company.Algorithms.ProblemSolving.Medium;

public class LongestCommonSubsequence {
    private static int[] longestCommonSubsequence(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;

        int LCS[][] = new int[m+1][n+1];
        for(int i = 0;i <= m;i++){
            for(int j = 0;j <= n;j++){
                if(i == 0 || j == 0){
                    LCS[i][j] = 0;
                }
                else if(a[i - 1] == b[j - 1]){
                    LCS[i][j] = 1 + LCS[i-1][j-1];
                }
                else{
                    LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
                }
            }
        }

        int xxxx = LCS[m][n];
        int arr[] = new int[xxxx];
        int sum = xxxx-1;

        while(xxxx > 0){

            int tmp = LCS[m][n];
            int tmp1 = LCS[m-1][n];
            int tmp2 = LCS[m][n-1];

            if(tmp == tmp1){
                m--;
            }
            else if(tmp == tmp2){
                n--;
            }
            else{
                n--;
                m--;
                xxxx--;
                arr[sum--] = b[n];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 1};
        int[] b = new int[] { 3, 4, 1, 2, 1, 3};
        int[] res = longestCommonSubsequence(a, b);

        for (int re : res) {
            System.out.println(re);
        }
    }
}
