package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/23 20:04
 * @explain: 进制求和
 */
public class SystemSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int sum = 0;
            for (int i = 2; i < a; i++) {
                sum += transform(a, i);
            }
            System.out.println(gradeDivision(sum, a - 2));
        }
    }

    public static int transform(int n, int bit) {
        int sum = 0;
        while (n != 0) {
            sum += n % bit;
            n /= bit;
        }
        return sum;
    }

    public static String gradeDivision(int children, int parent) {
        int remain = children % parent;
        int divi = children / parent;
        if (children % parent == 0) {
            return children / parent + "/1";
        } else {
            int comm = multiple(parent, remain);
            return ((remain + divi * parent) / comm) + "/" + parent / comm;
        }
    }

    /**
     * 求a,b的最大公倍数,其中 a>=b
     *
     * @param a
     * @param b
     * @return
     */
    public static int multiple(int a, int b) {
        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return b;
    }

    /**
     * 进制转化
     *
     * @param n
     * @param bit
     * @return
     */
    public static String transform2(int n, int bit) {
        StringBuilder sb = new StringBuilder();
        // 计算位数
        int length = 1;
        int tmp = n;
        while (tmp >= bit) {
            if (tmp / bit > 0) {
                tmp /= bit;
                length++;
            }
        }
        tmp = n;
        while (length > 0) {
            // 进制
            int s = (int) Math.pow(bit, length - 1);
            int coef = tmp / s;
            if (coef > 0) {
                sb.append(coef);
                tmp = tmp - coef * s;
            } else {
                sb.append(0);
            }
            length--;
        }
        return sb.toString();
    }
}
