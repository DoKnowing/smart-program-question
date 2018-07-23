package com.smart.program.dp;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/19 18:23
 * @explain:
 */
public class Rmb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rmb = {1, 5, 10, 20, 50, 100};
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = rmb[i]; j < dp.length; j++) {
                dp[j] += dp[j - rmb[i]];
            }
        }
        System.out.println(dp[n]);
    }
}
