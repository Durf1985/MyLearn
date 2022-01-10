package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//            FileInputStream inputStream = new FileInputStream("G:\\DTLiteInstaller.exe");
            FileInputStream inputStream = new FileInputStream(reader.readLine());
            byte[] buffer = new byte[inputStream.available()];
            if (buffer.length < 1000) {

                inputStream.close();
                throw new DownloadException();
            } else {
                int count = inputStream.read(buffer);
                System.out.println(count);
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
