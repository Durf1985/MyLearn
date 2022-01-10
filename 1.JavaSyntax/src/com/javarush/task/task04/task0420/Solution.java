package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers= new ArrayList<>();
        for (int i = 0; i < 3 ; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(integers,Collections.reverseOrder());
        for (int i = 0; i < integers.size() ; i++) {
            System.out.print(integers.get(i) + " ");
        }
    }
}
