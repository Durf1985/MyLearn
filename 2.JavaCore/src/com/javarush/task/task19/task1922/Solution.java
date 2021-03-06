package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String pathFile = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader("F:\\2.txt"));
//        reader = new BufferedReader(new FileReader(pathFile));
        while (reader.ready()) {
            String s = reader.readLine().trim();
            int counter = 0;
            if (counter <= 2) {
                for (int i = 0; i < words.size(); i++) {
                    Pattern pattern = Pattern.compile("(" + words.get(i) + " )|(" + words.get(i) + "$)");
                    Matcher matcher = pattern.matcher(s);
                    while (matcher.find()) {
                        counter++;
                    }
                }
            }

            if (counter == 2) {
                System.out.println(s);
            }
        }
        reader.close();
    }
}