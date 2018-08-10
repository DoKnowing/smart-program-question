package com.smart.program.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/08/03 15:07
 * @explain:
 */
public class RestaurantCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] deskSize = new int[n];
        for (int i = 0; i < n; i++) {
            deskSize[i] = sc.nextInt();
        }
        int[][] pc = new int[m][2];
        for (int i = 0; i < m; i++) {
            // 人数
            pc[i][0] = sc.nextInt();
            // 花费
            pc[i][1] = sc.nextInt();
        }
        // 根据花费排序
        Arrays.sort(pc, (o1, o2) -> o2[1] - o1[1]);
        Arrays.sort(deskSize);
        long sum = 0;
        int remainDesk = deskSize.length;
        for (int i = 0; i < pc.length && remainDesk >= 0; i++) {
            for (int j = 0; j < deskSize.length; j++) {
                if (pc[i][0] <= deskSize[j]) {
                    sum += pc[i][1];
                    remainDesk--;
                    deskSize[j] = -1;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
