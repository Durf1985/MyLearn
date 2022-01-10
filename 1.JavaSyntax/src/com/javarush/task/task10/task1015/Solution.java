package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] first = new ArrayList[10];
        for (int i = 0; i < first.length; i++) {
            ArrayList<String> second = new ArrayList<>();
            for (int j = 0; j < first.length; j++) {
                second.add("" + j);
            }
            first[i] = second;
        }
        return first;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}