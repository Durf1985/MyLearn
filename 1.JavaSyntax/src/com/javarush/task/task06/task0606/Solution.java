package com.javarush.task.task06.task0606;

import java.io.*;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int b = Integer.parseInt(reader.readLine());
//        int a = 0;
//        while (b > 0) {
//            a = b % 10;
//            if (a % 2 == 0) {
//                even++;
//            } else odd++;
//            b = b / 10;
//
//        }
//        System.out.printf("Even: %d Odd: %d", even,odd);


        int b = Integer.parseInt(reader.readLine());
        int a = 0;
        for (int i = b; i > 0; i /= 10) {
            a = i % 10;
            if (a % 2 == 0){
                even++;
            }else odd++;
        }
        System.out.printf("Even: %d Odd: %d", even,odd);
    }
}
