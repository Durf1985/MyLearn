package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> out = new ArrayList<>();
        while (reader.ready()) {
            String s = reader.readLine().trim();
            String[] list = s.split(" ");
            Pattern pattern = Pattern.compile("[0-9]");
            for (int i = 0; i < list.length; i++) {
                Matcher matcher = pattern.matcher(list[i]);
                if (matcher.find()) {
                    out.add(list[i]);
                }
            }
        }
        reader.close();
        StringBuilder stringBuilder = new StringBuilder();
        for (String s :
                out) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        String write = stringBuilder.toString().trim();
//        System.out.println(write);
        FileWriter fileWriter = new FileWriter(args[1]);
        fileWriter.write(write);
        fileWriter.flush();
        fileWriter.close();
    }
}

