package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        long[] arrBytes = new long[256];
        while (inputStream.available() > 0) {
            arrBytes[inputStream.read()]++;
        }
        long findMax = 0;
        for (int i = 0; i < arrBytes.length - 1; i++) {
            if (arrBytes[i]>findMax){
                findMax = arrBytes[i];
            }
        }
        for (int i = 255; i >=0 ; i--) {
            if (arrBytes[i]== findMax){
                System.out.print(i + " ");
            }
        }
        inputStream.close();
    }
}
