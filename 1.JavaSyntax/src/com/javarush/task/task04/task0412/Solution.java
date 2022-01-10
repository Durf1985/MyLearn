package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a<0){
            a++;
            System.out.println(a);
        }
        else if (a>0){
            a = a*2;
            System.out.println(a);
        }
        else if (a == 0){
            System.out.println(a);
        }
    }

}