package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/25 16:42
 * @explain:
 */
public class GeoHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int begin = -90;
        int end = 90;
        int mid = -1;
        StringBuilder sb = new StringBuilder();
        // 精度
        int precision = 6;
        while (precision-- > 0) {
            mid = (begin + end) / 2;
            if (n >= mid) {
                sb.append(1);
                begin = mid;
            } else {
                sb.append(0);
                end = mid;
            }
        }
        System.out.println(sb.toString());
    }
}
