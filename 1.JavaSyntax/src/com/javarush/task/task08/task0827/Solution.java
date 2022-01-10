package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        int result = Integer.parseInt(new SimpleDateFormat("D").format(new Date(date)));
        System.out.println(result);
        if (result%2 == 0){
            return false;
        }else return true;
    }
}
