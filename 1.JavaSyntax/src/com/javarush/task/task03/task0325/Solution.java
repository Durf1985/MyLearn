package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать $" + in + " в час");
    }
}
