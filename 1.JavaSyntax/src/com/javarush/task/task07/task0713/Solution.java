package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> div = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                div3.add(list.get(i));
                div2.add(list.get(i));
            } else if (list.get(i) % 3 == 0) div3.add(list.get(i));
            else if (list.get(i) % 2 == 0) div2.add(list.get(i));
            else div.add(list.get(i));
        }
        printList(div3);
        printList(div2);
        printList(div);
    }

    public static void printList(List<Integer> list) {
        for (Integer out : list) {
            System.out.println(out);
        }
    }
}
