package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];
        if (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count / 2 + count % 2);
            outputStream1.write(buffer, count / 2 + count % 2, count / 2);
        }

        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
