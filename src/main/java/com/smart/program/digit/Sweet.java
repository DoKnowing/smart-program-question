package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/08/03 16:46
 * @explain:
 */
public class Sweet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();  // X=A-B
        int y = sc.nextInt();  // Y=B-C
        int z = sc.nextInt();  // Z=A+B
        int m = sc.nextInt();  // M=B+C

        int a = (x + z) % 2 == 0 ? (x + z) / 2 : -1;
        int b = (y + m) % 2 == 0 ? (y + m) / 2 : -1;
        int c = (m - y) % 2 == 0 ? (m - y) / 2 : -1;

        if (a + b == z && a >= 0 && b >= 0 && c >= 0) {
            System.out.println(a + " " + b + " " + c);
        } else {
            System.out.println("No");
        }
    }
}
