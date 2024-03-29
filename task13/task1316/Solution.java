package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javarushQuests = JavarushQuest.values();
        for (int i = 0; i < JavarushQuest.values().length; i++) {
            System.out.println(javarushQuests[i].ordinal());
        }
    }
}
