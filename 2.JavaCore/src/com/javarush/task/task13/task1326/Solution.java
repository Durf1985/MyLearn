package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (fis.available() > 0) {
            StringBuilder a = new StringBuilder();
            while (fis.available() > 0) {
                char c = (char) fis.read();
                if (c == '\n' || c == '\r') break;
                a.append(c);
            }
            String s = a.toString();
            if (!s.equals("")) {
                list.add(Integer.parseInt(s));
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        fis.close();
        reader.close();
    }
}
