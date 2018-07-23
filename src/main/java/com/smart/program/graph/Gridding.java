package com.smart.program.graph;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/23 17:26
 * @explain:
 */
public class Gridding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        int m = sc.nextInt() + 1;
        int[][] gridding = new int[n][m];
        for (int i = 0; i < n; i++) {
            gridding[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            gridding[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                gridding[i][j] = gridding[i - 1][j] + gridding[i][j - 1];
            }
        }
        System.out.println(gridding[n - 1][m - 1]);
    }
}
