package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> pathFileList = new ArrayList<>();
        while (true) {
            String input = reader.readLine();
            if (input.equals("end")) {
                break;
            }
            pathFileList.add(input);
        }
        reader.close();
        Collections.sort(pathFileList);

        BufferedInputStream in;
        String path = pathFileList.get(0).split(".part\\d")[0];
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path, true));

        for (int i = 0; i < pathFileList.size(); i++) {
            in = new BufferedInputStream(new FileInputStream(pathFileList.get(i)));
            int n;
            while (in.available() > 0) {
                n = in.read();
                out.write(n);
            }
            in.close();
        }
        out.close();


    }
}

