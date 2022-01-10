package com.javarush.task.task07.task0708;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String test = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            String point = strings.get(i);
            if (test.length() < point.length()) {
                test = point;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            String out = strings.get(i);
            if (test.length() == out.length()) {
                System.out.println(out);
            }

        }
    }
}
