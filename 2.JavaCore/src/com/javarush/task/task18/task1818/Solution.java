package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        FileInputStream stream1 = new FileInputStream(reader.readLine());
        FileInputStream stream2 = new FileInputStream(reader.readLine());

        outputStream.write(read(stream1));
        outputStream.write(read(stream2));

        outputStream.close();
    }


    public static byte[] read(FileInputStream inputStream) throws IOException {
        byte[] buff = new byte[inputStream.available()];
        if (inputStream.available() > 0) {
            int count = inputStream.read(buff);
        }
        inputStream.close();
        return buff;
    }
}
