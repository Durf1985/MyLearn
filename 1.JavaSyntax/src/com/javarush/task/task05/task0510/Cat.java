package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public static void main(String[] args) {

    }

    public void initialize (String name){
        this.name = name;
        this.age = 10;
        this.weight =43;
        this.address = null;
        this.color = "red";

    }
    public void initialize (String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "red";
    }
    public void initialize (String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 45;
    }
    public void initialize (int weight,String color){
        this.name = null;
        this.age = 10;
        this.weight = weight;
        this.color = color;
        this.address = null;


    }
    public void initialize (int weight, String color, String address){
        this.name = null;
        this.age = 10;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


}
