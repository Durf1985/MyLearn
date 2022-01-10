package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 9; i > 1; i--) {
            array[i] = reader.readLine();
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}