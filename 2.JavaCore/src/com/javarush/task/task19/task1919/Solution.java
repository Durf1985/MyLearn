package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("правильное решение");
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> m = new TreeMap<>();

        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            if (m.containsKey(s[0])) {
                m.put(s[0], m.get(s[0]) + Double.parseDouble(s[1]));
            } else m.put(s[0], Double.parseDouble(s[1]));
        }
        System.out.println(m.size());
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey().length() + " " + entry.getValue().toString().length());
        }
        reader.close();
        System.out.println();
        System.out.println("неправильное решение");
        FileReader fileReader = new FileReader(args[0]);
//        FileReader fileReader = new FileReader("F:\\1.txt");
        char[] input = new char[256];
        StringBuffer stringBuffer = new StringBuffer();
        while (fileReader.ready()) {
            int s = fileReader.read(input);
            for (int i = 0; i < input.length; i++) {
                if (input[i] != 0) {
                    stringBuffer.append(input[i]);
                }
            }
        }
        String[] sum = stringBuffer.toString().split(System.lineSeparator());
        fileReader.close();
        Map<String, Double> map = new TreeMap<>();
        for (String s :
                sum) {
            String[] list = s.split(" ");
            double x = Double.parseDouble(list[1]);
            if (map.containsKey(list[0])) {
                map.merge(list[0], x, (a, b) -> a + b);
            } else {
                map.put(list[0], x);
            }
        }
        System.out.println(map.size());
        for (Map.Entry<String, Double> me :
                map.entrySet()) {
            System.out.println(me.getKey().length() + " " + me.getValue().toString().length());
        }

    }
}



