package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};

    public static void main(String[] args) {
        int number = array.length;
        int x = number /2;
        int y = x +1;
        if (number %2 == 0) {
            result[0] = Arrays.copyOfRange(array, 0, x);
            result[1] = Arrays.copyOfRange(array, x, array.length);
            System.out.println(Arrays.deepToString(result));
        }
            else{
            result[0] = Arrays.copyOfRange(array, 0, y);
            result[1] = Arrays.copyOfRange(array, y, array.length);
            System.out.println(Arrays.deepToString(result));
        }
        }
    }

