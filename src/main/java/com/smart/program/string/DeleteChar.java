package com.smart.program.string;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/28 16:03
 * @explain:
 */
public class DeleteChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String delete = sc.nextLine();
        String reg = "[" + delete + "]";
        System.out.println(str.replaceAll(reg, ""));
    }
}
