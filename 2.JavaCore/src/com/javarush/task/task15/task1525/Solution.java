package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader br = new BufferedReader(new FileReader(Statics.FILE_NAME));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                lines.add(sb.append(line).toString());
                sb = new StringBuilder();
                line = br.readLine();

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
