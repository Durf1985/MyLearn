package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        while (true) {
            String in = reader.readLine();
            if (in.equals("сумма")) {
                System.out.println(summa);
                break;
            }
            int i = Integer.parseInt(in);
            summa += i;
        }
    }
}
