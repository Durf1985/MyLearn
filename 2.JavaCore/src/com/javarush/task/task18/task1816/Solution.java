package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0] != null) {
            FileInputStream inputStream = new FileInputStream(args[0]);
            byte[] buff = new byte[inputStream.available()];
            int alh = 0;
            if (inputStream.available() > 0) {
                int count = inputStream.read(buff);
            }
            if (buff.length > 0) {
                for (int i = 0; i < buff.length; i++) {
                    if (buff[i] > 64 && buff[i] < 91 || buff[i] > 96 && buff[i] < 123) {
                        alh++;
                    }
                }
            }
            System.out.println(alh);
            inputStream.close();
        }
    }
}
