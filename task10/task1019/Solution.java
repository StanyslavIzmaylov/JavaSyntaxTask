package com.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Текущий год
*/

public class Solution {

    private int currentYear;

    public  Solution () {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return this.currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
      //  solution.Solution();
        System.out.println(solution.getCurrentYear());
    }
}
