package com.smart.program.string;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/25 16:13
 * @explain:
 */
public class SuperBrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mn = sc.next();
        StringBuilder first = new StringBuilder(sc.next());
        StringBuilder second = new StringBuilder(sc.next());
        // 正向
        boolean forward = false;
        int index = mn.indexOf(first.toString());
        int lastIndex = mn.lastIndexOf(second.toString());
        if (index > -1 && index + first.length() <= lastIndex) {
            forward = true;
        }
        // 反向
        boolean backward = false;
        int reverseIndex = mn.indexOf(second.reverse().toString());
        int reverseLastIndex = mn.lastIndexOf(first.reverse().toString());
        if (reverseIndex > -1 && reverseIndex + second.length() <= reverseLastIndex) {
            backward = true;
        }
        if (forward && backward) {
            System.out.println("both");
        } else if (forward) {
            System.out.println("forward");
        } else if (backward) {
            System.out.println("backward");
        } else {
            System.out.println("invalid");
        }
    }
}
