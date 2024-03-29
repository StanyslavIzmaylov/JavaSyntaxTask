package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1987, Calendar.SEPTEMBER, 17);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        Locale langRu = new Locale("ru");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", langRu);
        String message = dateFormat.format(calendar.getTime());
        return message;
    }
}
