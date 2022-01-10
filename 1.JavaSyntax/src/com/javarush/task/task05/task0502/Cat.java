package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static void main(String[] args) {
    }

    public boolean fight(Cat anotherCat) {
        int cat1 = this.weight + this.strength - this.age;
        int cat2 = anotherCat.weight + anotherCat.strength - anotherCat.age;
        if (cat1 > cat2) return true;
        else return false;
    }
}
