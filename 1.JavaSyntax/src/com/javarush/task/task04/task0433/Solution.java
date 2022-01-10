package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String out = "S";
        int controlVert = 0;
        int exit = 10;
        while (controlVert < exit) {
            int controlHoriz = 0;
            while (controlHoriz < 10) {
                System.out.print(out);
                controlHoriz++;
            }
            System.out.println();
            controlVert++;
        }

    }
}
