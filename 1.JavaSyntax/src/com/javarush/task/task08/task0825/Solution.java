package com.javarush.task.task08.task0825;

/* 
Модификатор запутался
*/

public class Solution {
    public static int A = 5;
    public static int B = 2;
    public static int D = B * A;
    public int C = A * B; // нестатичная может обращаться к статичным

    public static void main(String[] args) {
    }

    public int getValue() {
        return D;
    }
    // из нестатичного метода можно обращаться к статичной переменной

    public int getValue2() {
        return C;
    }

//    public static int getValue3() {
//        return C;
//    } статичный метод не может обращаться к нестатичной переменной.

}

