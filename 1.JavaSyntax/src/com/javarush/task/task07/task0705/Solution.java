package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] minia = new int[10];
        int[] minib = new int[10];

//        копирования массива с неизвестной длинной на 2 половины
//        ---------------------------------------

//        int check = (array.length - 1) / 2;
//        int bArray = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//            if (i <= check) {
//                minia[i] = array[i];
//            } else {
//                minib[bArray] = array[i];
//                bArray++;
//            }
//    }
//        for (int i = 0; i < minib.length; i++) {
//            System.out.println(minib[i]);
//        -------------------------------------------


//          копирование массива известной длинны на 2
//        -------------------------------------------
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        minia = Arrays.copyOfRange(array, 0, 9);
        minib = Arrays.copyOfRange(array, 10, array.length);
        for (int i = 0; i < minib.length; i++) {
            System.out.println(minib[i]);

        }
    }
}







