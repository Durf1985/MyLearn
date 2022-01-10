package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());
        }
        String large = array.get(0);
        String small = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            String test = array.get(i);
            if (test.length() > large.length()) large = test;
            if (test.length() < small.length()) small = test;
        }
        int li = 0;
        int si = 0;
        for (int i = 0; i < array.size(); i++) {
            String test = array.get(i);
            if (test.length() == small.length()) {
                si = i;
                break;
            }
        }
        for (int i = 0; i < array.size(); i++) {
            String test = array.get(i);
            if (test.length() == large.length()) {
                li = i;
                break;
            }
        }
        if (li > si) {
            System.out.println(array.get(si));
        } else System.out.println(array.get(li));
    }
}

