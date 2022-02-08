package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        if (bridge instanceof WaterBridge) {
            System.out.println(bridge.getCarsCount());
        } else if (bridge instanceof SuspensionBridge) {
            System.out.println(bridge.getCarsCount());
        }
        // не понимаю зачем я писал так, код ниже делает то же самое.
        // у нас нет задачи делать приведение типов, поэтому проверка instanceof лишняя

//        System.out.println(bridge.getCarsCount());
    }
}

