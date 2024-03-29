package com.javarush.task.pro.task07.task0706;

/* 
Странное деление
*/

public class Solution {
    public static void main(String[] args) {
        double a = 100.0 / 0.0;
        double b = - 100.0 / 0.0;
        div(a,b);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
