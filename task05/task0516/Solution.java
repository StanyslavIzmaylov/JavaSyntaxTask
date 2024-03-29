package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        Arrays.sort(array);
        int number = array.length;
        int x = number /2;
        if (number %2 == 0){
            Arrays.fill(array, 0, x, valueStart);
            Arrays.fill(array, x, number, valueEnd);
        System.out.println(Arrays.toString(array));}
            else{
             int y = x + 1;
            Arrays.fill(array, 0, y, valueStart);
            Arrays.fill(array, y, number, valueEnd);
        System.out.println(Arrays.toString(array));}
    }
}
