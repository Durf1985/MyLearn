package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Infinity());
        threads.add(new IEThread());
        threads.add(new Ura());
        threads.add(new fourThread());
        threads.add(new Summa());
    }

    public static void main(String[] args) {
    }

    public static class Infinity extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    public static class IEThread extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Ura extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    public static class fourThread extends Thread implements Message {
        private boolean check = true;

        @Override
        public void run() {
            while (check) {
            }
        }

        @Override
        public void showWarning() {
            check = false;
        }
    }

    public static class Summa extends Thread {
        private int summa = 0;
        private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        @Override
        public void run() {
            while (true) {
                try {
                    String input = reader.readLine();
                    if (input.equals("N")) {
                        break;
                    } else {
                        summa = summa + Integer.parseInt(input);
                    }
                } catch (IOException e) {
                } catch (NumberFormatException e) {
                }
            }
            System.out.println(summa);
        }
    }
}