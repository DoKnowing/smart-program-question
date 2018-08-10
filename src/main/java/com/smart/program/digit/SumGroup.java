package com.smart.program.digit;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author: Smart
 * @date: 2018/07/28 15:26
 * @explain:
 */
public class SumGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        length(n, m, new TreeSet<Integer>(), 1);
    }

    public static void length(int n, int m, TreeSet<Integer> set, int start) {
        if (m == 0) {
            StringBuilder sb = new StringBuilder();
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                sb.append(iterator.next()).append(" ");
            }
            sb.delete(sb.length() - 1, sb.length());
            System.out.println(sb);
        }

        for (int i = start; i <= n && i <= m; i++) {
            set.add(i);
            length(n, m - i, set, i + 1);
            set.pollLast();
        }
    }
}
