package com.javarush.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Поправочки нужны
*/
// ошибка была в HashMap<int, String> map Должен быть Integer
public class Solution {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {

        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution(); // создается Solution чтобы через конструктор
        //проинициализировать HashMap<>
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name); // данный индекс и имя это переменные объекта
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();// данный индекс и имя переменные класса
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
