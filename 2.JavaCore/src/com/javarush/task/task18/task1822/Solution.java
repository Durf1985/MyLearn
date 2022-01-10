package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File(pathReader.readLine());
        FileReader fr = new FileReader(file);
        BufferedReader fileReader = new BufferedReader(fr);

        String line = fileReader.readLine();
        while (line != null) {
            if (line.startsWith(args[0] + " ")) {
                System.out.println(line);
            }
            line = fileReader.readLine();
        }
        pathReader.close();
        fileReader.close();
    }
}
