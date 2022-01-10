package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePathIn = reader.readLine();
        String filePathOut = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(filePathIn));
//        BufferedReader fileReader = new BufferedReader(new FileReader("F:\\3.txt"));
        char[] list = new char[256];
        StringBuffer stringBuffer = new StringBuffer();
        while (fileReader.ready()) {
            int i = fileReader.read(list);
            for (int j = 0; j < list.length; j++) {
                stringBuffer.append(list[j]);
            }
        }


        String[] splitter = stringBuffer.toString().split("([a-zA-Zа-яА-Я]+[0-9]*)|([0-9]*+[a-zA-Zа-яА-Я])|\\W");
        fileReader.close();
        ArrayList<String> list1= new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < splitter.length; i++) {
            if (!splitter[i].isEmpty()) {
                if (i == splitter.length-1) {
                    buffer.append(splitter[i]);
                } else {
                    buffer.append(splitter[i]);
                    buffer.append(" ");
                }
            }
        }
        String out = buffer.toString();
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePathOut));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\2.txt"));
        writer.write(out);
        writer.flush();
        writer.close();

    }

}

