package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
//        firstFileName = "F:\\1.txt";
//        secondFileName = "F:\\test.txt";
        } catch (IOException e) {

        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private FileInputStream fileInputStream;
        private String out;
        private String strLine;
        private BufferedReader br;

        @Override
        public void setFileName(String fullFileName) {
            try {
                fileInputStream = new FileInputStream(fullFileName);

            } catch (IOException e) {
            }
        }

        @Override
        public void run() {
            try {
                br = new BufferedReader(new InputStreamReader(fileInputStream));
                StringBuilder stringBuilder = new StringBuilder();
                while ((strLine = br.readLine()) != null) {
                    stringBuilder.append(strLine);
                    stringBuilder.append(" ");
                }
                out = String.valueOf(stringBuilder);
            } catch (Exception e) {

            }
        }

        @Override
        public String getFileContent() {
            if (out == null){
                return "";
            }
            return out;
        }
    }
}
