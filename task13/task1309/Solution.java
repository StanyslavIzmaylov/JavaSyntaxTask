package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Серега", 3.0);
        grades.put("Николай", 5.0);
        grades.put("Иван Петрович", 3.5);
        grades.put("Анюта", 4.7);
        grades.put("Стас", 4.4);
    }
}
