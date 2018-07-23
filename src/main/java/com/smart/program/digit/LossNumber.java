package com.smart.program.digit;

import javax.naming.BinaryRefAddr;
import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/23 17:37
 * @explain:
 */
public class LossNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String remain = "";
        int post = 1;
        int index = 0;
        int next = 0;
        while (index < 3) {
            next = sc.nextInt();
            while (next != post) {
                index++;
                remain = Integer.parseInt(remain + post) % 7 + "";
                post++;
            }
            post++;
            if (index == 3) {
                System.out.println(remain);
                break;
            }
        }
    }
}
