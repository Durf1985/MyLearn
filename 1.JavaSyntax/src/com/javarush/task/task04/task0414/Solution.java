package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(reader.readLine());
        if (y%4 == 0 && y%100 != 0 || y%400 == 0 ) System.out.println("количество дней в году: 366");
        else if (y%4 == 0 && y%4 == 100 || y%400 != 0)System.out.println("количество дней в году: 365");
    }
}