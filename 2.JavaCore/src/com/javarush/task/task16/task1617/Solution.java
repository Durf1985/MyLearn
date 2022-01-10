package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();


    }

    public static class RacingClock extends Thread {
        private int timer = 0;

        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (!this.isInterrupted()) {
                    timer++;
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                    if (numSeconds == 0) {
                        throw new InterruptedException();
                    }
                }
            } catch (InterruptedException e) {
                if (timer > 3) {
                    System.out.print("Прервано!");
                } else if (timer == 3) {
                    System.out.print("Марш!");
                }
            }
        }
    }
}


