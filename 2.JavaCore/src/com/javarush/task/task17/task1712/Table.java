package com.javarush.task.task17.task1712;

public class Table {// столик
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder () {
        return new Order(number);
    }
}
