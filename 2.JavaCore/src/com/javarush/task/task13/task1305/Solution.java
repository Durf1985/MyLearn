package com.javarush.task.task13.task1305;

/* 
Четыре ошибки
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());// обращение к полю интерфейса, в котором создается объект и вызов метода
        System.out.println(new Hobby().toString());// динамичное создание объекта и вызов метода

    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1; // то поле общее

        @Override
        public String toString() {
            INDEX++; // увеличивается при каждом вызове этого метода
            return "" + INDEX;
        }
    }

}
