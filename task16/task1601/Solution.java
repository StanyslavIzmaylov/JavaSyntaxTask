package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(Calendar.DAY_OF_WEEK);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        Locale langRu = new Locale("ru");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", langRu);
        String message = dateFormat.format(date);
        return message;
    }
}
