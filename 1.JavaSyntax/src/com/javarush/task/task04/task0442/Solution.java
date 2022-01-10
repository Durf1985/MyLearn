package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int out = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                out += a;
                break;
            }
            out += a;
        }
        System.out.println(out);

    }
}
