package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).equals("мама")|| list.get(i).equals("мыла")|| list.get(i).equals("раму"))
                list.add(i+1,"именно");
        }
        for (String out : list ) {
            System.out.println(out);
        }
    }
}
