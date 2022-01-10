package com.javarush.task.task02.task0211;

/* 
Самое нужное число
*/
public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + x; //1

        x = x * 2;//2
        y = y + x;//2

        x = x * 2;//2
//        y = y + x;//4

        x = x * 2;//4
//        y = y + x;//

        x = x * 2;//16
        y = y + x;//31

        System.out.println(y);
    }
}
