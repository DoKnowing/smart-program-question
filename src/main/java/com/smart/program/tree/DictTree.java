package com.smart.program.tree;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/25 17:45
 * @explain:
 */
public class DictTree {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int w = c - 'a';
            if (i == 0) {
                count += w * (25 * 25 * 25 + 25 * 25 + 25 + 1) + 1;
            } else if (i == 1) {
                count += w * (25 * 25 + 25 + 1) + 1;
            } else if (i == 2) {
                count += w * (25 + 1) + 1;
            } else if (i == 3) {
                count += w + 1;
            }
        }
        System.out.println(count - 1);
    }
}
