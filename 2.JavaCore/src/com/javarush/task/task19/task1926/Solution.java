package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        reader.close();
//        reader = new BufferedReader(new FileReader("F:\\2.txt"));
        reader = new BufferedReader(new FileReader(path));
        while (reader.ready()) {
            String s = new StringBuffer(reader.readLine()).reverse().toString();
            System.out.println(s);
        }
        reader.close();
    }
}
