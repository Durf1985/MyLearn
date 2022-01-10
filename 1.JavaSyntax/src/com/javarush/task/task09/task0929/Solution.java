package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean empty = false;
        InputStream fileInputStream = null;
        while (!empty) {
            try {

                fileInputStream = getInputStream(reader.readLine());
                empty = true;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
                fileInputStream = getInputStream(reader.readLine());
                break;
            }
        }
        OutputStream fileOutputStream = getOutputStream(reader.readLine());

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

//F:\1.txt
//F:\test\copy.txt
//F:\2.txt