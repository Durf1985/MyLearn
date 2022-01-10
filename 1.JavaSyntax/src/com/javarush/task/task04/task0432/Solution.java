package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = 0;
        String stringIn = reader.readLine();
        int input = Integer.parseInt(reader.readLine());
        while (test < input) {
            test++;
            System.out.println(stringIn);
        }

    }
}
