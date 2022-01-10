package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        Human GF1 = new Human("Дед1", true, 90);
        Human GF2 = new Human("Дед2", true, 90);
        Human GM1 = new Human("Бабка1", false, 90);
        Human GM2 = new Human("Бабка2", false, 90);
        Human Father = new Human("Юрий Камнев", true, 40, GF1, GM1);
        Human Mother = new Human("Матрена", false, 40, GF2, GM2);
        Human son = new Human("Крис", true, 15, Father, Mother);
        Human son2 = new Human("Андрон", true, 15, Father, Mother);
        Human daughter = new Human("Тоня", false, 10, Father, Mother);
        humans.add(GF1);
        humans.add(GF2);
        humans.add(GM1);
        humans.add(GM2);
        humans.add(Father);
        humans.add(Mother);
        humans.add(son);
        humans.add(son2);
        humans.add(daughter);

        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i).toString());

        }
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















