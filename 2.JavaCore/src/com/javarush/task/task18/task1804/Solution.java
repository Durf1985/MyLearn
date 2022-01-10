package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
//        FileInputStream inputStream = new FileInputStream("G:\\1.txt");
        long[] arrBytes = new long[256];
        while (inputStream.available() > 0) {
            arrBytes[inputStream.read()]++;
        }
        long findMax = 0;
        long findMin = 0;
        for (int i = 0; i < arrBytes.length - 1; i++) {
            if (arrBytes[i] > findMax) {
                findMax = arrBytes[i];
            }
        }

        for (int i = 0; i < arrBytes.length - 1; i++) {
            if (arrBytes[i] < findMax&& arrBytes[i]!=0) {
                findMax = arrBytes[i];
            }
        }
        findMin = findMax;
        for (int i = 255; i >= 0; i--) {
            if (arrBytes[i] == findMin) {
                System.out.print(i + " ");
            }
        }
        inputStream.close();
    }
}
