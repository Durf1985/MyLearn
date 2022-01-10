package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static boolean exit = true;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (exit) {
            FileThread fileThread = new FileThread(reader.readLine());
            fileThread.start();
        }

    }

    public static class FileThread extends Thread {
        private String fileName;

        public FileThread(String fileName) {
            this.fileName = fileName;

        }

        @Override
        public void run() {

            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(fileName);
                if (exit) {
                    byte[] buff = new byte[inputStream.available()];
                    if (inputStream.available() > 0) {
                        int count = inputStream.read(buff);
                    }
                }
                inputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                exit = false;
            } catch (IOException e) {
            } finally {
                try {
                    inputStream.close();
                } catch (NullPointerException e) {
                } catch (IOException e) {
                }
            }
        }
    }

}
