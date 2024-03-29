package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {

         String name  = city.getName();
         int temperatur = city.getTemperature();
        System.out.println("В городе "+ name +" сегодня температура воздуха "+ temperatur);
    }

    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        showWeather(city);
    }


}
