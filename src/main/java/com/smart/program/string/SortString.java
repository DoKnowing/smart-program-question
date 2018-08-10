package com.smart.program.string;

import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/23 23:20
 * @explain:
 */
public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(solve(n, m));
    }

    private static long solve(long n, long m) {
        long ans = 1;
        while (m != 0) {
            long cnt = getCntOffset(ans, n);
            if (cnt >= m) {
                m--;
                if (m == 0)
                    break;
                ans *= 10;
            } else {
                m -= cnt;
                ans++;
            }
        }
        return ans;
    }

    public static long getCntOffset(long pre, long n) {
        long cnt = 1;
        long p = 10;
        while (pre * p <= n) {
            if (pre * p - 1 + p < n) {
                cnt += p;
            } else {
                cnt += n - pre * p + 1;
            }
            p = p * 10;
        }
        return cnt;
    }
}
