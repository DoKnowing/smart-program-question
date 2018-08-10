package com.smart.program.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/24 20:06
 * @explain:
 */
public class TouTiaoQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);

        int add = 0;
        int post = 0;
        while (post < n) {
            // 满足
            if (n - post >= 3 && score[post + 1] - 10 <= score[post] && score[post + 2] - 20 <= score[post]) {
                post += 3;
            } else if (n - post >= 2 && score[post + 1] - 20 <= score[post]) {
                add += 1;
                post += 2;
            } else {
                add += 2;
                post += 1;
            }
        }
        System.out.println(add);
    }
}
