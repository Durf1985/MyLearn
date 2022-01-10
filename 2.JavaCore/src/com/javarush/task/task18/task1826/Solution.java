package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[1]);
        byte[] buff = new byte[inputStream.available()];
        if (inputStream.available() > 0) {
            int count = inputStream.read(buff);
        }
        inputStream.close();
        switch (args[0]) {
            case "-e":
                encrypt(buff);
                break;
            case "-d":
                decrypt(buff);
                break;
        }

        FileOutputStream fos = new FileOutputStream(args[2]);
        fos.write(buff);
        fos.flush();
        fos.close();
    }

    public static byte[] encrypt(byte[] in) {

        for (int i = 0; i < in.length; i++) {
            in[i] = (byte) (in[i] + 1);
        }
        return in;
    }

    public static byte[] decrypt(byte[] in) {

        for (int i = 0; i < in.length; i++) {
            in[i] = (byte) (in[i] - 1);
        }
        return in;
    }
}