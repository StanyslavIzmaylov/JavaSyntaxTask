package com.javarush.task.pro.task16.task1615;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Ой как много методов!
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        Instant plusMinut = instant.plus(minutes, ChronoUnit.MINUTES);

        return plusMinut;
    }

    static public Instant plusHours(Instant instant, long hours) {
        Instant plusHours = instant.plus(hours, ChronoUnit.HOURS);

        return plusHours;
    }

    static public Instant plusDays(Instant instant, long days) {
        Instant plusDay = instant.plus(days, ChronoUnit.DAYS);

        return plusDay;
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        Instant minusMinutes = instant.minus(minutes, ChronoUnit.MINUTES);

        return minusMinutes;
    }

    static public Instant minusHours(Instant instant, long hours) {
        Instant minusHours = instant.minus(hours, ChronoUnit.HOURS);

        return minusHours;
    }

    static public Instant minusDays(Instant instant, long days) {
        Instant minusDays = instant.minus(days, ChronoUnit.DAYS);

        return minusDays;
    }
}
