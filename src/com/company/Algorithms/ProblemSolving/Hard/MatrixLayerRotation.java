package com.company.Algorithms.ProblemSolving.Hard;

import java.util.ArrayList;
import java.util.List;

public class MatrixLayerRotation {
    private static void matrixRotation(List<List<Integer>> matrix, int r) {
        int[][] mat = new int[r][r];
        int[][] res = new int[r][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                mat[i][j] = matrix.get(i).get(j);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                int row = i;
                int col = j;

                int layer = Math.min(Math.min(i, j), Math.min(r-i-1, r-j-1));
                int param = (r + r - 2) * 2 - 8 * layer;

                if (param == 0) {
                    res[i][j] = mat[i][j];
                    return;
                }

                int rot = matrix.size() % param;
                while (rot != 0) {
                    if(row==layer&&col==layer)
                        row++;
                    else if(row==layer&&col==r-layer-1)
                        col--;
                    else if(row==r-layer-1&&col==layer)
                        col++;
                    else if(row==r-layer-1&&col==r-layer-1)
                        row--;
                    else if(row==layer)
                        col--;
                    else if(col==layer)
                        row++;
                    else if(row==r-layer-1)
                        col++;
                    else if(col==r-layer-1)
                        row--;
                }
                res[row][col] = mat[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int r = 2;

        List<List<Integer>> integers = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        integers.add(first);

        List<Integer> second = new ArrayList<>();
        first.add(5);
        first.add(6);
        first.add(7);
        first.add(8);

        List<Integer> third = new ArrayList<>();
        first.add(9);
        first.add(10);
        first.add(11);
        first.add(12);

        List<Integer> fourth = new ArrayList<>();
        first.add(13);
        first.add(14);
        first.add(15);
        first.add(16);

        matrixRotation(integers, r);
    }
}
