package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {

        Instant maxTime = Instant.ofEpochMilli(Long.MAX_VALUE);
        return maxTime;
    }

    static Instant getMaxFromSeconds() {

        Instant maxSecond = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return maxSecond;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant maxSecondNano = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(),Instant.MAX.getNano());

        return maxSecondNano;
    }
}
