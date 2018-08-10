package com.smart.program.dp;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/28 16:39
 * @explain:
 */
public class SumArrayGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] array = new int[n + 1];
        array[0] = 0;
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(calculate(array, n, sum));
    }

    public static long calculate(int[] a, int n, int sum) {
        long dp[][] = new long[n + 1][sum + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j >= a[i])
                    dp[i][j] = dp[i - 1][j - a[i]] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][sum];
    }
}
