package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/17 15:56
 * @explain:
 */
public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        int m = sc.nextInt();
        double sum = num;
        for (int i = 1; i < m; i++) {
            num = Math.sqrt(num);
            sum += num;
        }
        System.out.println(String.format("%.2f", sum));
    }
}
