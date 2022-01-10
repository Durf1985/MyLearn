package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        SimpleDateFormat indate= new SimpleDateFormat("yyyy-MM-dd");
// строка парсируется в дату по шаблону симпл дате формат.

        Date in= indate.parse(input);
        SimpleDateFormat outdate = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);

//
        System.out.println(outdate.format(in).toUpperCase());
    }
}
