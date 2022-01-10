package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar = 0;
    public double doubleVar = 0.0d;
    public Double DoubleVar = null;
    public boolean booleanVar = false;
    public Object ObjectVar = null;
    public Exception ExceptionVar = null;
    public String StringVar = null;

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.intVar);
        System.out.println(a.doubleVar);
        System.out.println(a.DoubleVar);
        System.out.println(a.booleanVar);
        System.out.println(a.ObjectVar);
        System.out.println(a.ExceptionVar);
        System.out.println(a.StringVar);
    }
}
