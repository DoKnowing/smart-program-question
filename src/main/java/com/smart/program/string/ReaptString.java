package com.smart.program.string;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/18 20:49
 * @explain:
 */
public class ReaptString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var = sc.nextLine();

        int len = var.length();
        char[] cs = var.toCharArray();
        int[] hash = new int[128];
        for (int i = 0; i < len; i++) {
            boolean flag = (cs[i] >= 'A' && cs[i] <= 'Z') || (cs[i] >= 'a' && cs[i] <= 'z');
            if (!flag) {
                continue;
            }
            hash[cs[i]]++;
            if (hash[cs[i]] == 3) {
                System.out.println(cs[i]);
                break;
            }
        }
    }
}
