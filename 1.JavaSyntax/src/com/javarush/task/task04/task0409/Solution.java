package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        int a1 = a - 10;
        int b1 = b - 10;
//        abs(a1);
//        abs(b1);
//        if (a1<b1){
//            System.out.println(a);
//        }
//        else if (a1>b1){
//            System.out.println(b);
//        }
//        else System.out.println(b);
        if (abs(a1)<abs(b1)){
            System.out.println(a);
        }
        else if (abs(a1)>abs(b1)){
            System.out.println(b);
        }
        else System.out.println(b);

//        if (abs(a-10)<abs(b-10)){
//            System.out.println(a);
//        }
//        else if (abs(a-10)>abs(b-10)){
//            System.out.println(b);
//        }
//        else System.out.println(b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}