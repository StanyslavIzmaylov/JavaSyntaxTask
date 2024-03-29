package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }
        String[] stringsClone = strings.clone();
        for (int i = 0; i < strings.length; i++) {
            for (int k = 0; k < stringsClone.length; k++) {
                if (stringsClone[k].equals(strings[i]) && i != k) {
                    strings[i] = null;
                }
            }
        }

                    for (int i = 0; i < strings.length; i++) {
                        System.out.print(strings[i] + ", ");
                    }


    }
    }
