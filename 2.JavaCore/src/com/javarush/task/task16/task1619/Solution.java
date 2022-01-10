package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.setIsCancel(false);
    }

    public static class TestThread implements Runnable {
        private static boolean isCancel = true;

        public static void setIsCancel(boolean isCancel) {
            TestThread.isCancel = isCancel;
        }

        public void run() {
            while (isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
