package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int max(int num1, int num2, int num3, int num4) {
        int maxOfNums = Math.max(Math.max(num1,num2), Math.max(num3, num4));
        return maxOfNums;
    }

    public static int max(int num1, int num2, int num3) {
        int maxOfNums = Math.max(num1, Math.max(num3, num2));
        return maxOfNums;
    }
    public static int max(int num1, int num2) {
        int maxOfNums = Math.max(num1, num2);
        return maxOfNums;
    }
    public static int min(int num1, int num2, int num3, int num4, int num5) {
        int maxOfNums = Math.min(num5, Math.min(Math.min(num1, num2), Math.max(num3, num4)));
        return maxOfNums;
    }
        public static int min(int num1, int num2, int num3, int num4) {
            int maxOfNums = Math.min(Math.max(num1,num2), Math.min(num3, num4));
            return maxOfNums;
        }

        public static int min(int num1, int num2, int num3) {
            int maxOfNums = Math.min(num1, Math.min(num3, num2));
            return maxOfNums;
        }
        public static int min(int num1, int num2) {
            int maxOfNums = Math.min(num1, num2);
            return maxOfNums;
        }
        public static int max(int num1, int num2, int num3, int num4, int num5) {
            int maxOfNums = Math.max(num5, Math.max(Math.max(num1,num2), Math.max(num3, num4)));
            return maxOfNums;
}
}
