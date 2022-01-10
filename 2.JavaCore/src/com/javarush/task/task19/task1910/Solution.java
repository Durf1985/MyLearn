package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();
//        BufferedReader fileReader = new BufferedReader(new FileReader("F:\\3.txt"));
        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        char[] list = new char[255];
        StringBuffer stringBuffer = new StringBuffer();
        while (fileReader.ready()) {
            int i = fileReader.read(list);// int заносится в массив char
            for (int j = 0; j < list.length; j++) {
                if (list[j] != 0) {
                    stringBuffer.append(list[j]);
                }
            }
        }
        fileReader.close();
        String mid = stringBuffer.toString().replaceAll("\\n|[^a-zA-Zа-яА-Я0-9 ]", "");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\2.txt"));
        bufferedWriter.write(mid);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
