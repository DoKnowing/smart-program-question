package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/30 20:05
 * @explain:
 */
public class ScaleTranslate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        int bit = sc.nextInt();
        System.out.println(transform(s, bit));
    }

    public static String transform(long n, int bit) {
        StringBuilder sb = new StringBuilder();
        if (n < 0) {
            sb.append("-");
            n = n * -1;
        }
        // 计算位数
        int length = 1;
        long tmp = n;
        while (tmp >= bit) {
            if (tmp / bit > 0) {
                tmp /= bit;
                length++;
            }
        }
        tmp = n;
        while (length > 0) {
            // 进制
            long s = (long) Math.pow(bit, length - 1);
            int coef = (int) (tmp / s);
            if (coef > 0) {
                sb.append(int2Str(coef));
                tmp = tmp - coef * s;
            } else {
                sb.append(0);
            }
            length--;
        }
        return sb.toString();
    }

    public static String int2Str(int coef) {
        if (coef == 10) {
            return "A";
        } else if (coef == 11) {
            return "B";
        } else if (coef == 12) {
            return "C";
        } else if (coef == 13) {
            return "D";
        } else if (coef == 14) {
            return "E";
        } else if (coef == 15) {
            return "F";
        }
        return coef + "";
    }
}
