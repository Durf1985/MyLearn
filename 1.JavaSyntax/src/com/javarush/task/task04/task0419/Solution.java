package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());
       int b = Integer.parseInt(reader.readLine());
       int c = Integer.parseInt(reader.readLine());
       int d = Integer.parseInt(reader.readLine());
        System.out.println(max(a,max(b,max(c,d))));
    }
    public static int max (int a, int b){
        if (a < b) {
            return b;
        }
        else if (a > b) {
            return a;
        }
        return a;
    }
}