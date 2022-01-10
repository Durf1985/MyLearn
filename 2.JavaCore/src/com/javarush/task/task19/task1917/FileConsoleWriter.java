package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;
import java.nio.charset.Charset;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }


    public static void main(String[] args) throws IOException {
//        FileConsoleWriter fileConsoleWriter = new FileConsoleWriter("F:\\2.txt");
//        char[] chars = {'a', 's', 'd'};
//        int a = 111;
//        String s = "Новая строка";
//        fileConsoleWriter.write(chars, 1, chars.length);
//        fileConsoleWriter.write(a);
//        fileConsoleWriter.write(s);
//        fileConsoleWriter.close();


    }


    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(String.valueOf(cbuf));

    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        osw.write(str, off, len);
        osw.close();
        fileWriter.flush();
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        osw.write(cbuf, off, len);
        osw.close();
        fileWriter.flush();
    }

    public void close() throws IOException {
        fileWriter.close();

    }


}
