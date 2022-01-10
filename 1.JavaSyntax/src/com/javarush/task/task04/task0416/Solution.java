package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        t = t % 10;
        System.out.println(t);
        if (t >= 0 && t < 3 || t >= 5 && t < 8) {
            System.out.println("зелёный");
        } else if (t >= 3 && t < 4 || t >= 8 && t < 9) {
            System.out.println("жёлтый");
        } else if (t >= 4 && t < 5 || t >= 9) {
            System.out.println("красный");
        }

    }
}