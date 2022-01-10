package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myVers = new PrintStream(outputStream);
        System.setOut(myVers);
        testString.printSomething();
        String result = outputStream.toString().replaceAll("\r\n", "");
        String[] list = result.split(" ");
        String out = null;
        switch (list[1]) {
            case "+":
                int plus = Integer.parseInt(list[0]) + Integer.parseInt(list[2]);
                out = list[0] + " + " + list[2] + " = " + plus;
                break;
            case "-":
                int minus = Integer.parseInt(list[0]) - Integer.parseInt(list[2]);
                out = list[0] + " - " + list[2] + " = " + minus;
                break;
            case "*":
                int mult = Integer.parseInt(list[0]) * Integer.parseInt(list[2]);
                out = list[0] + " * " + list[2] + " = " + mult;
                break;
        }

        System.setOut(originalOut);
        System.out.println(out);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

