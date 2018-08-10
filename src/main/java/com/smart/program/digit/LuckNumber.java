package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/23 22:56
 * @explain:
 */
public class LuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (transform(i, 2) == transform(i, 10)) {
                num++;
            }
        }
        System.out.println(num);
    }

    public static int transform(int n, int bit) {
        int sum = 0;
        while (n != 0) {
            sum += n % bit;
            n /= bit;
        }
        return sum;
    }
}
