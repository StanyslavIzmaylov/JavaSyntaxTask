package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        if (index == 11) {
            Month newmonth = Month.values()[0];
            return newmonth;
        } else {
            Month newmonth = Month.values()[index + 1];
            return newmonth;
        }

    }
}
