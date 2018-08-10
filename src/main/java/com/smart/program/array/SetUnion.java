package com.smart.program.array;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author: Smart
 * @date: 2018/07/23 21:01
 * @explain:
 */
public class SetUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }
        Iterator<Integer> iterator = set.iterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(" ");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }
}
