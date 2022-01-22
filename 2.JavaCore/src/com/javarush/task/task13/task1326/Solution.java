package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        // такая сложность из-за того что fis не читает всей строкой, а читает только по 1 символу
        // следовательно нужно прочитать строку по-символьно, склеить в билдере, найти у нее
        // перевод строки или перевод каретки, выйти из цикла чтения, преобразовать билдер в
        // строчку после этого проверить что это не пустая строка и парсировать ее в int с занесением в
        // массив, если бы строка читалась сразу, то такой сложности не потребовалось бы.
        while (fis.available() > 0) {
            StringBuilder a = new StringBuilder();
            while (fis.available() > 0) {
                char c = (char) fis.read();
                if (c == '\n' || c == '\r') break;
                a.append(c);
            }
            String s = a.toString();
            if (!s.equals("")) {
                list.add(Integer.parseInt(s));
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        fis.close();
        reader.close();
    }
}
