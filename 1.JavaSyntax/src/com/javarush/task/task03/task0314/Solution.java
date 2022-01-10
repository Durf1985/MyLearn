package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        while (a < 11) {
            for (int i = 1; i < 11; i++) {
                System.out.print(a * i + " ");
            }
            System.out.println();
            a++;
        }
    }
}


