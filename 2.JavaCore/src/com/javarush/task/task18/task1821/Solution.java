package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(args[0]);
//        FileInputStream inputStream = new FileInputStream("G:\\1.txt");
        long[] arrBytes = new long[256];
        while (inputStream.available() > 0) {
            arrBytes[inputStream.read()]++;
        }
//        Arrays.sort(arrBytes);
        for (int i = 0; i < arrBytes.length - 1; i++) {
            if (arrBytes[i] > 0) {
                System.out.println((char) i + " " + arrBytes[i]);
            }
        }

        inputStream.close();
    }
}

