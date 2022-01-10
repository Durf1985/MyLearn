package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args)  {
        Human child = new Human("1", true, 12);
        Human child2 = new Human("2", true, 10);
        Human child3 = new Human("3", true, 19);
        Human father = new Human("F", true, 40, child, child2, child3);
        Human mother = new Human("M", false, 40, child,child2,child3);
        Human ded = new Human("Ded", true, 80, father);
        Human ded2 = new Human("Ded2", true, 80, mother);
        Human babka = new Human("Babka", false, 80, father);
        Human babka2 = new Human("Babka2", false, 80, mother);
        System.out.println(ded.toString());
        System.out.println(ded2.toString());
        System.out.println(babka.toString());
        System.out.println(babka2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age, Human... humans) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, humans);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
