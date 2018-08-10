package com.smart.program.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Smart
 * @date: 2018/07/28 16:11
 * @explain:
 */
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String max = "";
        String reg = "\\d+";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String sub = matcher.group();
            if (max.length() < sub.length()) {
                max = sub;
            }
        }
        System.out.println(max);
    }
}
