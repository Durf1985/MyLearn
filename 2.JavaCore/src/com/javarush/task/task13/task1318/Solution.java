package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        while (fis.available() > 0) {
            int a = fis.read(); // int обозначает размер, который будет считываться
            System.out.print((char) a);
        }
        fis.close();
        reader.close();
    }

}