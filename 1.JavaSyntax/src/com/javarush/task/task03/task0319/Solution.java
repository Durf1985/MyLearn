package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + one + " через " + two + " лет.");

    }
}
