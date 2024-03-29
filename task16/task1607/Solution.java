package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();

        return today;
    }

    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);

        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);
        int day = date.getDayOfYear();
        LocalDate newData = LocalDate.ofYearDay(2020, day);

        return newData;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate today = LocalDate.ofEpochDay(18517);

        return today;
    }
}
