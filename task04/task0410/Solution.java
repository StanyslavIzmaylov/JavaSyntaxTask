package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
      while (scanner.hasNextInt()){
          int number = scanner.nextInt();
          if (number < min1) {
              min2 = min1;
              min1 = number;
          } else if (number > min1 && number < min2)
                  min2 = number;
              
          
          
      }
        System.out.println(min2);
        

    }
}