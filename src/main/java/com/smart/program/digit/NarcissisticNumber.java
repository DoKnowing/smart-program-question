package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/16 20:11
 * @explain: 水仙花数
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (narcissus(i)) {
                sb.append(i).append(" ");
            }
        }
        if (sb.length() == 0) {
            System.out.println("no");
        } else {
            sb.delete(sb.length() - 1, sb.length());
            System.out.println(sb);
        }
    }

    public static boolean narcissus(int post) {
        if (post < 100 || post > 999) {
            return false;
        }
        int n3 = post / 100; // 百位
        int n2 = (post / 10) % 10; // 十位
        int n1 = post % 10; // 各位
        int n = (int) (Math.pow(n1, 3) + Math.pow(n2, 3) + Math.pow(n3, 3));
        if (n == post) {
            return true;
        }
        return false;
    }
}
