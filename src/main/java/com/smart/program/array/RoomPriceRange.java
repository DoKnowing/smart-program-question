package com.smart.program.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Smart
 * @date: 2018/07/19 16:10
 * @explain:
 */
public class RoomPriceRange {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        int[] array = new int[20000];
        while ((line = bf.readLine()) != null && !"".equals(line)) {
            String[] vars = line.split(" ");
            int start = Integer.parseInt(vars[0]);
            int end = Integer.parseInt(vars[1]);
            int price = Integer.parseInt(vars[2]);
            for (int i = start; i <= end; i++) {
                array[i] = price;
            }
        }

        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();
        while (start < array.length && end < array.length) {
            if (array[start] == 0) {
                start++;
                continue;
            }
            end = start;
            while (array[start] == array[end]) {
                end++;
            }
            sb.append("[").append(start).append(", ").append(end - 1).append(", ").append(array[start]).append("],");
            start = end;
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }
}
