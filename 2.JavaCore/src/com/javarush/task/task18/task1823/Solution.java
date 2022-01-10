package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String path = reader.readLine();
            if (path.equals("exit")) {
                reader.close();
                break;
            }
            ReadThread readThread = new ReadThread(path);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }


        public void run() {
            try {

                FileInputStream inputStream = new FileInputStream(fileName);
                long[] arrBytes = new long[256];
                while (inputStream.available() > 0) {
                    arrBytes[inputStream.read()]++;
                }
                int findMax = 0; // число повторений
                for (int i = 0; i < arrBytes.length - 1; i++) {
                    if (arrBytes[i] > findMax) {
                        findMax = (int) arrBytes[i];
                    }
                }
                for (int i = 255; i >= 0; i--) { // i номер байта
                    if (arrBytes[i] == findMax) { // arrBytes[i] число повторений конкретного байта ищем максимальное
                        resultMap.put(fileName, i); // добавляем номер максимальноповторяющегося байта.
                    }
                }
                inputStream.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
