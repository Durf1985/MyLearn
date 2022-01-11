package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList(); // Массив списков
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] first = new ArrayList[10]; // 10 списков в массиве
        for (int i = 0; i < first.length; i++) {
            ArrayList<String> second = new ArrayList<>(); //создание списка для массива
            for (int j = 0; j < first.length; j++) {
                second.add("" + j);// заполнение списка хламом
            }
            first[i] = second; // добавление списка в массив
        }
        return first;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) { //перебираем массив списков
            for (String s : list) { // перебираем список
                System.out.println(s);
            }
        }
    }
}