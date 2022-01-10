package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
//        list.add("Вишня");
//        list.add("1");
//        list.add("Боб");
//        list.add("3");
//        list.add("Яблоко");
//        list.add("22");
//        list.add("0");
//        list.add("Арбуз");
//        list.add("Тест");
//        list.add("тест");
//        list.add("1");
//        list.add("строка");
//        list.add("8");
//        list.add("8");
//        list.add("8");
//        list.add("для");
//        list.add("5s");
        String[] array = list.toArray(new String[0]);
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (!isNumber(array[i])) {
                for (int j = 0; j < i; j++) {
                    if (!isNumber(array[j])) {
                        if (isGreaterThan(array[j], array[i])) {
                            String tmp = array[i];
                            array[i] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                int a = Integer.parseInt(array[i]);
                for (int j = 0; j < array.length - 1; j++) {
                    if (isNumber(array[j])) {
                        int b = Integer.parseInt(array[j]);
                        if (b < a) {
                            String tmp = array[i];
                            array[i] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
            }
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // одиночный '-'
            {
                return false;
            }
        }
        return true;
    }

}
