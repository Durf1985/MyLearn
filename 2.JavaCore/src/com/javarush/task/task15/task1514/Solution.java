package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "23");
        labels.put(2.0, "12");
        labels.put(3.9, "sdf");
        labels.put(32.4, "zv");
        labels.put(345.6, "fhg");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
