package com.smart.program.graph;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/17 20:15
 * @explain:
 */
public class MinGem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gem(sc.next()));
        sc.close();
    }

    public static int gem(String str) {
        char[] cs = str.toCharArray();
        int len = str.length();
        for (int i = 5; i < len; i++) { // 取宝石的个数
            for (int j = 0; j < len; j++) { // 迭代的次数,取i个的方式
                StringBuilder sb = new StringBuilder();
                for (int k = j; k < i + j; k++) {
                    sb.append(cs[k % len]); // 构造成环
                }
                String tmp = sb.toString();
                if (tmp.contains("A") &&
                        tmp.contains("B") &&
                        tmp.contains("C") &&
                        tmp.contains("D") &&
                        tmp.contains("E")) {
                    return len - i;
                }
            }
        }
        return 0;
    }

}
