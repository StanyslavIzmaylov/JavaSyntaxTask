package com.javarush.task.pro.task05.task0519;

import javax.swing.text.StyledEditorKit;
import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {

        int [] tmp =  Arrays.copyOf(array,array.length);
        Arrays.sort(tmp);
        int str = Arrays.binarySearch(tmp, element);

               System.out.println(str >= 0);

            }
        }




