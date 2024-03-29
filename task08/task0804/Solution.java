package com.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    {
        for (int i = 0; i < 99; i++) {
            int x = generateNumber();
            System.out.println(x);
        }
    }
    public static int generateNumber() {
        return (int) (Math.random() * 6) + 1;

    }
}
