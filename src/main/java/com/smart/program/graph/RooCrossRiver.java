package com.smart.program.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: Smart
 * @date: 2018/07/17 17:32
 * @explain:
 */
public class RooCrossRiver {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int[] value = new int[length];
        for (int i = 0; i < length; ++i) {
            value[i] = Integer.parseInt(data[i]);
        }
        int[] dp = new int[length + 1];
        for (int i = 0; i < dp.length; ++i)
            dp[i] = Integer.MAX_VALUE;
        dp[0] = 1;
        for (int i = 1; i <= length; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                if (value[j] == 0) {
                    continue;
                } else if (j + value[j] >= i && dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        if (dp[length] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(dp[length] - 1);
    }
}
