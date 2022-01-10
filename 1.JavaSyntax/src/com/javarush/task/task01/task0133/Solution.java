package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        date.setHours(15);
        date.setMinutes(30);
        Date date1 = new Date();
        date1.setHours(15);
        date1.setMinutes(00);

        int secondsAfter15 = (date.getMinutes()-date1.getMinutes())*60;
        System.out.println(secondsAfter15);
        System.out.println("1+2=" + 1 + 2);
    }
}