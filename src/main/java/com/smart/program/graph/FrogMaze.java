package com.smart.program.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: Smart
 * @date: 2018/07/30 20:58
 * @explain:
 */
public class FrogMaze {
    static int maxRemainEnergy = 0;
    static boolean flag = false;
    static String path = "";
    static LinkedList<String> linkedlist = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        jump(maze, 0, 0, p);
        if (flag) {
            System.out.println(path);
        } else {
            System.out.println("Can not escape!");
        }
    }

    public static void jump(int[][] maze, int x, int y, int energy) {
        // 返回本跳
        if (energy < 0 || x < 0 || y < 0 || x >= maze.length || y >= maze[0].length || maze[x][y] != 1) {
            return;
        }
        linkedlist.offer("[" + x + "," + y + "]");
        // 递推标志已走
        maze[x][y] = 0;
        if (x == 0 && y == maze[0].length - 1) {
            if (energy >= maxRemainEnergy) {
                maxRemainEnergy = energy;
                updatePath();
            }
            maze[x][y] = 1;
            linkedlist.removeLast();
            flag = true;
            return;
        }
        jump(maze, x, y + 1, energy - 1);
        jump(maze, x + 1, y, energy);
        jump(maze, x - 1, y, energy - 3);
        jump(maze, x, y - 1, energy - 1);
        // 返回原值
        maze[x][y] = 1;
        linkedlist.removeLast();
    }

    public static void updatePath() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = linkedlist.iterator();
        while (iterator.hasNext())
            sb.append(iterator.next() + ",");
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        path = sb.toString();
    }
}
