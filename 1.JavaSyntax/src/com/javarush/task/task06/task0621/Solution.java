package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(i,reader.readLine());
        }
        Cat catGf = new Cat(list.get(0));
        Cat catGm = new Cat(list.get(1));
        Cat catF = new Cat(list.get(2), null, catGf);
        Cat catM = new Cat(list.get(3), catGm, null);
        Cat son = new Cat(list.get(4), catM, catF);
        Cat daughter = new Cat(list.get(5), catM, catF);
        System.out.println(catGf);
        System.out.println(catGm);
        System.out.println(catF);
        System.out.println(catM);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String consta = "The cat's name is ";
            if (mother == null && father == null)
                return consta + name + ", no mother, no father";
            else if (mother == null) {
                return consta + name + ", no mother, father is " + father.name;
            } else if (father == null) {
                return consta + name + ", mother is " + mother.name + ", no father";
            } else
                return consta + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}


