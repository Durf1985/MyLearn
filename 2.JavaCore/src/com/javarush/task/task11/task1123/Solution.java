package com.javarush.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        //можно просто отсортировать массив и передать первый и заключительный элементы в Pair
        // по условию задачи массив изменять нельзя, поэтому нужно создать его копию и
        // производить манипуляции на копии
        int min = inputArray[0];
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length-1; i++) {
            if (max<inputArray[i+1]){
                max = inputArray[i+1];
            }else if (min>inputArray[i+1]){
                min = inputArray[i+1];
            }
        }
        return new Pair<Integer, Integer>(min, max);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
