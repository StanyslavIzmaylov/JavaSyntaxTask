package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int counter=0;
        int result = 0;
        while(decimalNumber !=0) {
            int temp = (int) ((decimalNumber%8) * Math.pow(10, counter));
            counter++;
            result += temp;
            decimalNumber /= 8;
        }
       if  (result <=0)
           return 0;
       else return result;
    }

    public static int toDecimal(int octalNumber) {
        int counter=0;
        int result = 0;
        while(octalNumber !=0) {
            int temp = (int) ((octalNumber%10) * Math.pow(8, counter));
            counter++;
            result += temp;
            octalNumber /= 10;
        }
        if  (result <=0)
            return 0;
        else return result;

    }
}
