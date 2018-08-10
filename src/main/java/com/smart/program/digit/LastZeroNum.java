package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/30 20:17
 * @explain:
 */
public class LastZeroNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zeroNum = 0;

        while (n > 0) {
            zeroNum += n / 5;
            n = n / 5;
        }
        System.out.println(zeroNum);
    }
}
