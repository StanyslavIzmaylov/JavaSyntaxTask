package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        OutputStream output = connection.getOutputStream();
        try (PrintStream printStream = new PrintStream(output)) {
            printStream.println("Привет");

            InputStream input = connection.getInputStream();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input))) {
                while (bufferedReader.ready()){
                    System.out.println(bufferedReader.readLine());
                }
        }

    }
}
}

