package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileRoad1 = scanner.nextLine();
        String fileRoad2 = scanner.nextLine();
        try (InputStream is = Files.newInputStream(Path.of(fileRoad1));
             OutputStream os = Files.newOutputStream(Path.of(fileRoad2))) {
            byte[] input_data = is.readAllBytes();
            for (int i = 0; i < input_data.length / 2; i++) {
                byte temp = input_data[2 * i];
                input_data[2 * i] = input_data[2 * i + 1];
                input_data[2 * i + 1] = temp;
            }
            os.write(input_data);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}


