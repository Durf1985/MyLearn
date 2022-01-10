package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int height;
        private int weight;
        private int children;
        private boolean sex;

        public Human() {

        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, int height, int weight, int children) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.children = children;
        }

        public Human(String name, int age, int height, int weight, int children, boolean sex) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.children = children;
            this.sex = sex;
        }
    }
}
