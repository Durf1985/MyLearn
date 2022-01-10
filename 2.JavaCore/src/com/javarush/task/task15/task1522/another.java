package com.javarush.task.task15.task1522;

public class another {
    private static another ourInstance = new another();

    public static another getInstance() {
        return ourInstance;
    }

    private another() {
    }
}
