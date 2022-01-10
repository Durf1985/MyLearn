package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());
        }
        String offset = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (offset.length() < array.get(i).length()) {
                offset = array.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }

    }
}


