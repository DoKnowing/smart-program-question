package com.smart.program.digit;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/08/03 15:45
 * @explain:
 */
public class ContinueMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int currentSum = nums[0];
        int currentMax = nums[0];
//        LinkedList<Integer> link = new LinkedList<>();
//        link.add(nums[0]);
//        LinkedList<Integer> linkMost = new LinkedList<>();
        for (int i = 1; i < n; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
//                link.clear();
//                link.add(nums[i]);
            } else {
                currentSum += nums[i];
//                link.add(nums[i]);
            }
            if (currentSum > currentMax) {
                currentMax = currentSum;
//                linkMost.clear();
//                linkMost.addAll(link);
            }
        }

        System.out.println(currentMax);
//        System.out.println(linkMost.toString());
    }
}
