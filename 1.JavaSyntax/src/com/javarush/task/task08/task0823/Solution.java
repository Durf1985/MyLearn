package com.javarush.task.task08.task0823;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
//        String s = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) { //на случай, если будет введена пустая строка.

            } else {
                String out = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
                System.out.print(out + " ");

            }
        }
    }
}
