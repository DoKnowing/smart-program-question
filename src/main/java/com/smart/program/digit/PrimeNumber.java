package com.smart.program.digit;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/25 16:54
 * @explain:
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n / 2 + 1; i++) {
            int other = n - i;
            if (isPrime(i) && isPrime(other)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            int appNum = (int) Math.sqrt(number);
            int i = 1;
            while (i++ < appNum) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
