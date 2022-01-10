package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (c != ' ') list.add(c);
        }
        ArrayList<Character> Vowel = new ArrayList<>();
        ArrayList<Character> noVowel = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isVowel(list.get(i))) {
                Vowel.add(list.get(i));
            } else {
                noVowel.add(list.get(i));
            }
        }
        for (char out : Vowel) {
            System.out.print(out + " ");
        }
        System.out.println();
        for (char out : noVowel) {
            System.out.print(out + " ");
        }
    }


    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
}