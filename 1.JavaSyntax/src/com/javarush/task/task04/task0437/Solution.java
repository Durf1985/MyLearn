package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int j = 1;
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < j; k++) {
                System.out.print(8);
            }
            System.out.println();
            j++;
        }
    }
}
