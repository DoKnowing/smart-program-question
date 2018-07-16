package com.smart.program.string;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/16 17:50
 * @explain:
 */
public class StringMobileCodeDencrypt {
    public static void main(String[] args) {
        // 特殊: Z-ZERO, W-TWO,  U-FOUR , X-SIX, G-EIGHT
        // 特殊2: O-ONE, R-THREE, F-FIVE, S-SEVEN
        // 特殊3: NINE
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] vars = new String[n];
        for (int i = 0; i < n; i++) {
            vars[i] = count(sc.next());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vars[i]);
        }
    }

    public static String count(String str) {
        int[] hash = new int[10];
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0) {
            if (sb.toString().contains("Z")) {
                hash[2] = hash[2] + 1;
                sb.deleteCharAt(sb.indexOf("Z"));
                sb.deleteCharAt(sb.indexOf("E"));
                sb.deleteCharAt(sb.indexOf("R"));
                sb.deleteCharAt(sb.indexOf("O"));
                continue;
            }
            if (sb.toString().contains("W")) {
                hash[4] = hash[4] + 1;
                sb.deleteCharAt(sb.indexOf("T"));
                sb.deleteCharAt(sb.indexOf("W"));
                sb.deleteCharAt(sb.indexOf("O"));
                continue;
            }
            if (sb.toString().contains("U")) {
                hash[6] = hash[6] + 1;
                sb.deleteCharAt(sb.indexOf("F"));
                sb.deleteCharAt(sb.indexOf("O"));
                sb.deleteCharAt(sb.indexOf("U"));
                sb.deleteCharAt(sb.indexOf("R"));
                continue;
            }
            if (sb.toString().contains("X")) {
                hash[8] = hash[8] + 1;
                sb.deleteCharAt(sb.indexOf("S"));
                sb.deleteCharAt(sb.indexOf("I"));
                sb.deleteCharAt(sb.indexOf("X"));
                continue;
            }
            if (sb.toString().contains("G")) {
                hash[0] = hash[0] + 1;
                sb.deleteCharAt(sb.indexOf("E"));
                sb.deleteCharAt(sb.indexOf("I"));
                sb.deleteCharAt(sb.indexOf("G"));
                sb.deleteCharAt(sb.indexOf("H"));
                sb.deleteCharAt(sb.indexOf("T"));
                continue;
            }
            if (sb.toString().contains("O")) {
                hash[3] = hash[3] + 1;
                sb.deleteCharAt(sb.indexOf("O"));
                sb.deleteCharAt(sb.indexOf("N"));
                sb.deleteCharAt(sb.indexOf("E"));
                continue;
            }
            if (sb.toString().contains("R")) {
                hash[5] = hash[5] + 1;
                sb.deleteCharAt(sb.indexOf("T"));
                sb.deleteCharAt(sb.indexOf("H"));
                sb.deleteCharAt(sb.indexOf("R"));
                sb.deleteCharAt(sb.indexOf("E"));
                sb.deleteCharAt(sb.indexOf("E"));
                continue;
            }
            if (sb.toString().contains("F")) {
                hash[7] = hash[7] + 1;
                sb.deleteCharAt(sb.indexOf("F"));
                sb.deleteCharAt(sb.indexOf("I"));
                sb.deleteCharAt(sb.indexOf("V"));
                sb.deleteCharAt(sb.indexOf("E"));
                continue;
            }
            if (sb.toString().contains("S")) {
                hash[9] = hash[9] + 1;
                sb.deleteCharAt(sb.indexOf("S"));
                sb.deleteCharAt(sb.indexOf("E"));
                sb.deleteCharAt(sb.indexOf("V"));
                sb.deleteCharAt(sb.indexOf("E"));
                sb.deleteCharAt(sb.indexOf("N"));
                continue;
            }
            if (sb.toString().contains("I")) {
                hash[1] = hash[1] + 1;
                sb.deleteCharAt(sb.indexOf("N"));
                sb.deleteCharAt(sb.indexOf("I"));
                sb.deleteCharAt(sb.indexOf("N"));
                sb.deleteCharAt(sb.indexOf("E"));
            }
        }
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int j = hash[i];
            while (j-- > 0) {
                num.append(i);
            }
        }
        return num.toString();
    }
}
