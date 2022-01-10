package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int in2 = Integer.parseInt(reader.readLine());
        String in = reader.readLine();
        String firstText = " захватит мир через ";
        String secondText = " лет. Му-ха-ха!";
        System.out.println(in + firstText + in2 + secondText);
    }
}
