package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            String name1 = "" + i;
            Zerg zerg = new Zerg();
            zerg.name = name1;
        }
        for (int i = 0; i < 3; i++) {
            String name1 = "" + i;
            Protoss protoss = new Protoss();
            protoss.name = name1;

        }
        for (int i = 0; i < 4; i++) {
            String name1 = "" + i;
            Terran terran = new Terran();
            terran.name = name1;

        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
