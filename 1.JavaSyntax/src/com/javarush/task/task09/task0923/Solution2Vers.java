package com.javarush.task.task09.task0923;



/*
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить две строки.
•	Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
•	Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
•	Каждая строка должна заканчиваться пробелом.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2Vers {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] list = input.toCharArray();
        ArrayList<Character> consonant = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>();

        for (char c : list) {
            if (c != ' ') {
                if (isVowel(c)) {
                    vowels.add(c);
                } else {
                    consonant.add(c);
                }
            }
        }

        for (Character character : vowels) {
            System.out.print(character + " ");
        }
        System.out.println();
        for (Character character : consonant) {
            System.out.print(character + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        // я бы еще добавил сюда проверку на пробел между словами, но это общий паттерн для гласных
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
