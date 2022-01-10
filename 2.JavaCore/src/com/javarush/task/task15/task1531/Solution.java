package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {

        BigDecimal bigDecimal = normalBigfactorial(n);

        return bigDecimal + "";
    }

    public static BigDecimal normalBigfactorial(int a) {
        if (a < 0) return new BigDecimal(0);
        else if (a == 0) return new BigDecimal(1);
        else if (a == 1) return new BigDecimal(1);
        return new BigDecimal(a).multiply(normalBigfactorial(a - 1));
    }


}