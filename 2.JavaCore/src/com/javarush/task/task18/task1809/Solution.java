package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        byte[] file = new byte[inputStream.available()];

        if (inputStream.available() > 0) {
            int count = inputStream.read(file);
            for (int i = file.length - 1; i >= 0; i--) {
                outputStream.write(file[i]);
            }
        }
        inputStream.close();
        outputStream.close();
    }
}
