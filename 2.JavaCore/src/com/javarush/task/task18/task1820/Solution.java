package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Scanner in = new Scanner(inputStream);
        in.useLocale(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            int a = Math.round(in.nextFloat());
            sb.append(a);
            sb.append(" ");
        }
        String out = sb.toString();
        FileWriter fileWriter = new FileWriter(reader.readLine());
        fileWriter.write(out);
        fileWriter.flush();
        reader.close();
        inputStream.close();
        in.close();
        fileWriter.close();
    }

}
