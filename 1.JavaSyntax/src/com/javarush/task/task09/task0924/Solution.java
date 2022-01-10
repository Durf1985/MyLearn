package com.javarush.task.task09.task0924;

import java.util.ArrayList;

/* 
Страшная сказка
*/

public class Solution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf(); // статическая переменная, статического вложенного класса.

    public static void main(String[] args) {
        wolf.ate.add(grandmother);
        //каждый персонаж записывает в собственный список то что он сделал.

        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }

    //красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    //бабушка
    public static class Grandmother extends StoryItem {
    }

    //пирожек
    public static class Patty extends StoryItem {
    }

    //дровосек
    public static class Woodman extends StoryItem {
    }

    //волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        // абстрактный класс содержит поля с объектами сосбственного класса.
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
