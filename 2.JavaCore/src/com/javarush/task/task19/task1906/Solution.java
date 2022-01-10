package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileNameRead = reader.readLine();
//        String fileNameWrite = reader.readLine();
//        FileReader fileReader = new FileReader(fileNameRead);
        FileReader fileReader = new FileReader("F:\\2.txt");
//        reader.close();
        char[] chars = new char[256];
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            int i = fileReader.read(chars);
//            stringBuilder.append(chars[1]);
            for (int j = 1; j < chars.length; j++) {
                if (j % 2 != 0) {
                    stringBuilder.append(chars[j]);
                }
            }
        }
        fileReader.close();
        String write = stringBuilder.toString();
        FileWriter fileWriter = new FileWriter("F:\\3.txt");
//        FileWriter fileWriter = new FileWriter(fileNameWrite);
        fileWriter.write(write);
        fileWriter.flush();
        fileWriter.close();
    }
}
