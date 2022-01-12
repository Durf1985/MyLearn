package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        //кружок это показывает куда я смотрю, отключается
        // в Alt+ Tab можно выбирать приложение взглядом.
        // в проводнике Edge можно выбирать страницу через Alt+Tab взглядом.
        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }
}

