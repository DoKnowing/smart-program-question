package com.smart.program.string;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/13 20:57
 * @explain: 数串
 */
public class StringRequest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] vars = new String[n];
        for (int i = 0; i < n; i++) {
            vars[i] = sc.next();
        }
//        Arrays.sort(vars, (s1, s2) -> comp(s1, s2));
        // 排序
        quickSort(vars, 0, vars.length - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            sb.append(vars[i - 1]);
        }
        System.out.println(sb);
    }

    public static int comp2(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return 0;
        } else if (s1 == null) {
            return -1;
        } else if (s2 == null) {
            return 1;
        }
        if (s1.length() == s2.length()) {
            return s1.compareTo(s2);
        } else if (s1.length() > s2.length()) {
            if (s1.startsWith(s2)) {
                while (s2.length() < s1.length()) {
                    s2 += s2;
                }
                return s1.compareTo(s2);
            } else {
                return s1.compareTo(s2);

            }
        } else {
            if (s2.startsWith(s1)) {
                while (s1.length() < s2.length()) {
                    s1 += s1;
                }
                return s1.compareTo(s2);
            } else {
                return s1.compareTo(s2);
            }
        }
    }

    public static int comp(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return 0;
        } else if (s1 == null) {
            return -1;
        } else if (s2 == null) {
            return 1;
        } else if (s1.equals(s2)) {
            return 0;
        }
        int min = s1.length() > s2.length() ? s2.length() : s1.length();
        int post = 0;
        while (post < min) {
            if (s1.charAt(post) > s2.charAt(post)) {
                return 1;
            } else if (s1.charAt(post) < s2.charAt(post)) {
                return -1;
            } else {
                post++;
            }
        }
        if (min == s1.length() && s1.length() < s2.length()) {
            // s2长,叠加s1
            while (s1.length() < s2.length()) {
                s1 += s1;
            }
            while (post < s2.length()) {
                if (s1.charAt(post) > s2.charAt(post)) {
                    return 1;
                } else if (s1.charAt(post) < s2.charAt(post)) {
                    return -1;
                }
            }
        } else if (min == s2.length() && s1.length() > s2.length()) {
            // s1的长,叠加s2
            while (s1.length() > s2.length()) {
                s2 += s2;
            }
            while (post < s1.length()) {
                if (s1.charAt(post) > s2.charAt(post)) {
                    return 1;
                } else if (s1.charAt(post) < s2.charAt(post)) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /**
     * 快排
     *
     * @param vars  : 原数组
     * @param start : 开始位置
     * @param end   : 结束位置
     */
    public static void quickSort(String[] vars, int start, int end) {
        if (start < 0 || start > end || end > (vars.length - 1)) {
            return;
        }
        String flag = vars[start];
        int i = start;
        int j = end;
        while (i < j) {
            // 从最后面比较
            while (i < j) {
                if (comp(vars[j], flag) < 0) {
                    vars[i] = vars[j];
                    i++;
                    break;
                } else {
                    j--;
                }
            }
            // 从左边比较
            while (i < j) {
                if (comp(vars[i], flag) > 0) {
                    vars[j] = vars[i];
                    j--;
                    break;
                } else {
                    i++;
                }
            }
        }
        vars[i] = flag;
        // 比较左边
        quickSort(vars, start, i - 1);
        // 比较右边
        quickSort(vars, i + 1, end);
    }
}
