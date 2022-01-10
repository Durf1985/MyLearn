package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileRead = reader.readLine();
        String fileWrite = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead));
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\1.txt"));
        StringBuffer stringBuffer = new StringBuffer();
        char[] list = new char[255];
        while (bufferedReader.ready()) {
            int a = bufferedReader.read(list);
            for (int i = 0; i < list.length; i++) {
                if (list[i] != 0) {
                    if (list[i] == '.') {
                        list[i] = '!';
                        stringBuffer.append(list[i]);
                    } else {
                        stringBuffer.append(list[i]);
                    }
                }
            }
        }
        String out = stringBuffer.toString();
        bufferedReader.close();

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\2.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWrite));
        bufferedWriter.write(out);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}

