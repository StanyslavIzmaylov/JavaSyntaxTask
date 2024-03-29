package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    public static String[] hexStatic = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    public static String[] binStatic = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hex = "";
        if (binaryNumber == null) {
            return hex;
        }
        if (binaryNumber.length() % 4 != 0) {
            binaryNumber = 0 + binaryNumber;
        }
        char[] binaryNumberToArray = binaryNumber.toCharArray();               // создаем из строки массив символов.

        for (char bin : binaryNumberToArray) {                                  // проверяем на 0 и 1.
            if (bin != '1' && bin != '0') {
                return hex;
            }
        }
        String forbit = "0";
        int count = 0;
        for (int i = 0; i < binaryNumberToArray.length; i += 4) {
            forbit = binaryNumber.substring(i, i + 4);
            ++count;
            for (int j = 0; j < binStatic.length; j++)
                if (binStatic[j].equals(forbit)) {
                    hex = hex + hexStatic[j];
                }
        }
        return hex;
    }


    public static String toBinary(String hexNumber) {
        String binar = "";
        if (hexNumber == null) {
            return binar;
        }

        int count = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            String hexbin = hexNumber.substring(i, i + 1);
            ++count;
            for (int j = 0; j < hexStatic.length; j++) {
                if (hexbin.equals(hexStatic[j])) {
                    binar = binar + binStatic[j];
                }
            }
            if (binar.length() != count * 4) binar = "";
        }
        return binar;
    }
}





