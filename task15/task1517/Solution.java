package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        boolean exists = Files.exists(filePath);
        boolean notext = Files.notExists(filePath);
        boolean notexists = Files.notExists(fileNewPath);
        boolean exist = Files.exists(fileNewPath);
        if (notext){
            Files.createFile(filePath);}
        else if (exists && notexists){
                Files.move(filePath,fileNewPath);
            }  else if (exists && exist)  {
                Files.delete(filePath);
        }
        }
    }


