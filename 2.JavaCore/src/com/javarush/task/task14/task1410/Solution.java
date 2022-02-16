package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
//        Wine wine = new BubblyWine();
//        System.out.println(wine.getHolidayName());
//        вызывается реализация метода по правой части, а не по левой
    }

    public static Drink getDeliciousDrink() {

        return new Wine();
    }

    public static Wine getWine() {

        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}
