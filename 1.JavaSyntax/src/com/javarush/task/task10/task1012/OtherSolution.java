package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherSolution {



/*
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв
 (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9

Требования:
•	Программа должна 10 раз считывать данные с клавиатуры.
•	Программа должна выводить текст на экран.
•	Выведенный текст должен содержать 33 строки.
•	Каждая строка вывода должна содержать букву русского алфавита, пробел
 и сколько раз буква встречалась в введенных строках.
*/


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        int[] count = new int[alphabet.size()]; //указываем что наш массив счетчик будет по размеру равен списку букв
        for (int i = 0; i < alphabet.size(); i++) { // берем буквы по порядку для проверки
            for (String s : list) {// берем строку из массива для поиска символов
                if (s.contains(alphabet.get(i).toString())) { // если строка содержит нужный проверочный символ
                    char[] pars = s.toCharArray(); // преобразовываем строку в массив символов
                    for (char par : pars) { //берем каждый полученный символ
                        if (alphabet.get(i).equals(par)) { // сравниваем с текущим символом проверки
                            count[i]++; // если символы совпадают, то увеличить счетчик по этому индексу на 1
                        }
                    }
                }
            }// одну букву ищем во всех строках, только потом меняем букву и заново прогоняем по всем строкам
        }
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + count[i]);
            // так как брали символы мы в порядке алфавита,
            // то индекс в алфавите должен совпасть с индексом в массиве счетчике
        }
        System.out.println();
    }
}


