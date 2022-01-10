package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        long start = System.currentTimeMillis();
        int c;
        int result = 0;
        String n = Integer.toString(number);
        char[] chars = n.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            c = Character.getNumericValue(chars[i]);
            result = result + c;
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
        return result;
    }
}
