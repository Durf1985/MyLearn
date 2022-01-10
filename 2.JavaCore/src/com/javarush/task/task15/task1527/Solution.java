package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Formatter;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        reader.close();
        String s = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo&obj=3.14&obj&name=Amigo&obj=Amom";
        URL url = new URL(s);
        String param = url.getQuery();

        String[] pametr = param.split("[&]");
        for (String a : pametr) {
            if (a.contains("=")) {
                String[] b = a.split("=");
                System.out.print(b[0] + " ");
            } else {
                System.out.print(a + " ");
            }
        }
        System.out.println();

        String[] value = param.split("[&]");
        for (String x : value) {
            if (x.contains("obj=")) {
                String[] a = x.split("=");
                try {
                    double d = Double.parseDouble(a[1]);
                    alert(d);
                } catch (NumberFormatException e) {
                    alert(a[1]);
                }
            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

