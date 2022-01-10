package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("asdf", 10, "asdf");
        Man man2 = new Man("asdf1", 11, "1asdf");
        Woman woman = new Woman("nsdf", 12, "xzcv");
        Woman woman2 = new Woman("nsdf1", 13, "1xzcv");
        System.out.println(man.getName()+ " " + man.getAge() + " " + man.getAddress());
        System.out.println(man2.getName()+ " " + man2.getAge() + " " + man2.getAddress());
        System.out.println(woman.getName()+ " " + woman.getAge() + " " + woman.getAddress());
        System.out.println(woman2.getName()+ " " + woman2.getAge() + " " + woman2.getAddress());
    }


    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
