package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
//        BufferedReader reader = new BufferedReader(new FileReader("F:\\1.txt"));
        Map<String, Double> map = new TreeMap<>();
        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            if (map.containsKey(s[0])) {
                map.merge(s[0], Double.parseDouble(s[1]), (a, b) -> a + b);
            } else {
                map.put(s[0], Double.parseDouble(s[1]));
            }
        }
        reader.close();
        double point =0;
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Double> pair :
                map.entrySet()) {
            if (point < pair.getValue()) {
                point = pair.getValue();
//                System.out.println(point);
            }
        }
        for (Map.Entry<String, Double> pair :
                map.entrySet()) {
            if (pair.getValue() == point) {
                list.add(pair.getKey());
            }
        }
        Collections.sort(list);
        for (String s :
                list) {
            System.out.print(s + " ");
        }
    }
}
