package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        array = new int[number];

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();;
            if (min < array[i])
                min = array[i];
        }
        System.out.println(min);
    }
}
