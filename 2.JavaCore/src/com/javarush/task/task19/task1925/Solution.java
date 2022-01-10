package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> list = new ArrayList<>();
        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                if (s[i].length() > 6) {
                    list.add(s[i]);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
                stringBuilder.append(list.get(i));
                stringBuilder.append(" ");
        }
        String out = stringBuilder.toString().trim().replaceAll(" ",",");
        System.out.println(out);
        reader.close();
        FileWriter fileWriter = new FileWriter(args[1]);
        fileWriter.write(out);
        fileWriter.flush();
        fileWriter.close();
    }
}
