package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате
*/
public class Solution {
    public static void main(String[] args) {
        salary(700);
    }

    public static void salary(int a) {
        String first = "Твоя зарплата составляет: ";
        String second = " долларов в месяц.";
        int result = a + 100;
        System.out.println(first + result + second);//напишите тут ваш код
    }
}
