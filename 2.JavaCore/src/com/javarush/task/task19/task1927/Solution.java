package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream my = new PrintStream(outputStream);
        System.setOut(my);
        testString.printSomething();
        String promotion = "JavaRush - курсы Java онлайн";
        String[] result = outputStream.toString().split(System.lineSeparator());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (i % 2 != 0) {
                list.add(result[i]);
                list.add(promotion);
            } else {
                list.add(result[i]);
            }
        }
        System.setOut(console);
        for (String s :
                list) {

            System.out.println(s);
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
