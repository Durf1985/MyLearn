package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inOut = reader.readLine();
        String in = reader.readLine();

        FileInputStream stream1 = new FileInputStream(inOut);
        FileInputStream stream2 = new FileInputStream(in);


        byte[] buff = new byte[stream1.available() + stream2.available()];
        int count = 0;

        if (stream1.available() > 0) {
            count = stream1.read(buff, stream2.available(), stream1.available());
        }

        if (stream2.available() > 0) {
            count = stream2.read(buff);
        }

        FileOutputStream outputStream = new FileOutputStream(inOut);
        outputStream.write(buff);
        stream1.close();
        stream2.close();
        outputStream.close();
    }
}
