package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance;// закрыли доступ к полю

    private Singleton() {// закрыли доступ к конструктору
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

}

