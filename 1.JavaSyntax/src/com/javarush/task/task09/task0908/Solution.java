package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {

            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        //напишите тут ваш код

    }
}
