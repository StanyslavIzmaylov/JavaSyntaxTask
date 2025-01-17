package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        //System.out.println(intArray);
        System.out.println(min(intArray));
    }

    public static int min(int[] intArray) {
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++ )
            min = Math.min(min, intArray[i]);
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scr = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = scr.nextInt();

        return array;
    }
}
