package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            FileInputStream inputStream = new FileInputStream(args[0]);
            byte[] buff = new byte[inputStream.available()];
            if (inputStream.available() > 0) {
                int count = inputStream.read(buff);
            }

            int space = 0;
            int sim = 0;
            if (buff.length > 0) {
                for (int i = 0; i < buff.length; i++) {
                    if (buff[i] == 32) {
                        space++;
                        sim++;
                    } else {
                        sim++;
                    }
                }
            }
            double div = (double) space / sim * 100; // процентное соотношение
            System.out.printf(Locale.ENGLISH, "%.2f%n", div);
            inputStream.close();
        }
    }
}
