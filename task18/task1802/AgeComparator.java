package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student>{
    public int compare (Student student1, Student student2) {
        if (student1.getAge() == student2.getAge()) {
            return 0;
        } else if (student1.getAge() > student2.getAge()) {
            return -1;
        } else
            return 1;
    }
}
