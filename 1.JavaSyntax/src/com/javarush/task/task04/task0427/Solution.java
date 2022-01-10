package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine(); // у вас уже есть строка, которую надо измерить
        int a = Integer.parseInt(input);  // так же у вас есть число, которое надо проверить на четность
        int b = Integer.parseInt(reader.readLine()); // здесь же придется парсить число в строку, что вы и делает.
        if (a > 0 && a < 1000) {
            if (even(a)) {
                System.out.println("четное " + lenght(input));
            } else System.out.println("нечетное " + lenght(input));
        } else {
        }
    }


    public static boolean even(int a) {
        return a % 2 == 0;
    }

    public static String lenght(String in) {
        if (in.length() == 1) {
            return "однозначное число";
        } else if (in.length() == 2) return "двузначное число";
        else return "трехзначное число";
    }

}
