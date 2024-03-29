package com.javarush.task.pro.task05.task0505;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int[] array = new int[number];
        if (number > 0)
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
        for (int i = array.length; i > 0; i--) {
            if (number % 2 == 0)
                System.out.println(array[i-1]);
        }
        for (int i = 0; i < array.length; i++) {
            if (number % 2 != 0)
                System.out.println(array[i]);
        }

    }
}








