package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int y = 1;
        while (y < 11) {
            int x = 1;
            while (x < 11){
                System.out.print((x * y) + " ");
                x++;
            }
            System.out.println();
            y++;
        }

    }
}
