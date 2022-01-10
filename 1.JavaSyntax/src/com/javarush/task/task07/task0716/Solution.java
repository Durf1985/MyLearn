package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String ar = list.get(i);
            if (ar.contains("р") && ar.contains("л")) result.add(ar);
            else if (ar.contains("р")) {
            } else if (ar.contains("л")) {
                result.add(ar);
                result.add(ar);
            }

            else result.add(ar);
        }
        return result;
    }
}