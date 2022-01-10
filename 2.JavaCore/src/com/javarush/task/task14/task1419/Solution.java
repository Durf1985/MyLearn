package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[2];
            System.out.println(a[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            String s = "asdf";
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            FileInputStream fis = new FileInputStream("F:\\123.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(i + "");
            }
            for (int i = 0; i < list.size(); i++) {
                list.remove(i);
            }
            for (int i = 0; i < 10; i++) {
                list.remove(i);
            }
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> list = new ArrayList<>(-1);
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        try {
            Object o = new Date();
            Integer i = (Integer) o;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            Integer num = null;
            int a = 10 / num;
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            throw new StringIndexOutOfBoundsException();
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
    }
}
