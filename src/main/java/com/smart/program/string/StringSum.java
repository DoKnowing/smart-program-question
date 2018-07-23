package com.smart.program.string;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/19 17:37
 * @explain:
 */
public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() > s2.length()) {
            System.out.println(add(s1, s2));
        } else {
            System.out.println(add(s2, s1));
        }
    }

    public static String add(String big, String small) {
        int bigLen = big.length();
        int smallLen = small.length();
        int post = 0;
        boolean flag = false; // 下一次计算是否有进一
        StringBuilder sb = new StringBuilder();
        while (post < smallLen) {
            int a = number(big.charAt(bigLen - post - 1));
            int b = number(small.charAt(smallLen - post - 1));
            if (a < 0 || b < 0) {
                return "error";
            }
            int sum = 0;
            if (flag) {
                sum = a + b + 1;
            } else {
                sum = a + b;
            }
            if (sum > 9) {
                flag = true;
            } else {
                flag = false;
            }
            sb.append(sum % 10);
            post++;
        }
        if (flag) {
            sb.append("1");
        }
        for (int i = bigLen - post - 1; i >= 0; i--) {
            sb.append(big.charAt(i));
        }
        return sb.reverse().toString();
    }

    public static int number(char c) {
        int a = c - '0';
        if (a >= 0 && a <= 9) {
            return a;
        }
        return -1;
    }
}
