package com.javarush.task.pro.task09.task0906;

/*
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 5;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static int toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {

        }
        int B_Number = 0;
        int cnt = 0;
        while (decimalNumber != 0) {
            long rem = decimalNumber % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            decimalNumber /= 2;
            cnt++;
        }


        return B_Number;
    }



    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals(""))
            return 0;
        long decimal = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                decimal += Math.pow(2, (binaryNumber.length() - i - 1));
            }
        }

        return (int)decimal;

    }
}
