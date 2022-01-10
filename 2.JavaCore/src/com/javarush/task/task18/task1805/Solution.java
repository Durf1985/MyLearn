package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileInputStream inputStream = new FileInputStream("G:\\1.txt");
        long[] arrBytes = new long[256];
        while (inputStream.available() > 0) {
            arrBytes[inputStream.read()]++;
        }
//        Arrays.sort(arrBytes);
        for (int i = 0; i < arrBytes.length - 1; i++) {
            if (arrBytes[i] > 0) {
                System.out.print(i + " ");
                System.out.println((char)i);
            }
        }

        inputStream.close();
    }
}
