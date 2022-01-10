package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String paht = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(paht);
        StringBuffer stringBuffer = new StringBuffer();

        char[] input = new char[255];
        while (fileReader.ready()) {
            int i = fileReader.read(input);
            for (int j = 0; j < input.length; j++) {
                stringBuffer.append(input[j]);
            }
        }

        String sort = stringBuffer.toString();
        fileReader.close();
        Pattern pattern = Pattern.compile("world[ ,.!?]");
        Matcher matcher = pattern.matcher(sort);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
