package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        int str = concole.nextInt();
        // multiArray = new int[str][];
        multiArray = new int[str][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[concole.nextInt()];
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println(multiArray[i][j] + " ");

            }
            System.out.println();
        }

    }
}




