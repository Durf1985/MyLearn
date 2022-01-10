package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int sum = 0;
        double result;
        while (true) {
            int input = Integer.parseInt(reader.readLine());
            if (input == -1) {
                result = (double) sum / count * 1.0;
                break;
            }
            sum = sum + input;
            count++;
        }
        System.out.println(result);
    }
}

