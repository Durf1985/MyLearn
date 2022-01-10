package com.javarush.task.task19.task1913;

public class test {

    public static void main(String[] args) {
        String result = "it's 1 a 23 text 4 f5-6or7 tes8ting";
        String[] test = result.split("\\D");
        for (String s :
                test) {
            System.out.print(s);
        }
    }
}
