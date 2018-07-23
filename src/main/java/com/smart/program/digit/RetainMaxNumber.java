package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/18 14:53
 * @explain:
 */
public class RetainMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int m = sc.nextInt();
        StringBuilder cs = new StringBuilder(n);

        // 删除最小的m个数字
        while (m > 0) {
            int len = cs.length();
            int s = 0;
            while (s < (len - 1) && cs.codePointAt(s) >= cs.codePointAt(s + 1))
                s++;
            // 后一位大于前一位就删除前一位
            cs.deleteCharAt(s);
            m--;
        }
        System.out.println(cs);
    }
}

