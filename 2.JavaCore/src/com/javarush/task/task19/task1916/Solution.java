package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();
        ArrayList<String> A = readList(firstFile);
        ArrayList<String> B = readList(secondFile);
//        ArrayList<String> A = readList("F:\\2.txt");
//        ArrayList<String> B = readList("F:\\3.txt");
        boolean exit = true;

        while (exit) {

            if (A.get(0).equals(B.get(0))) {
                lines.add(new LineItem(Type.SAME, A.get(0)));
                A.remove(0);
                B.remove(0);
                if (A.isEmpty() || B.isEmpty()) {
                    break;
                }
            }
            if (!A.get(0).equals(B.get(0))) {
                if (A.get(1).equals(B.get(0))) {
                    lines.add(new LineItem(Type.REMOVED, A.get(0)));
                    A.remove(0);
                    if (A.isEmpty() || B.isEmpty()) {
                        break;
                    }
                }
            }
            if (A.get(0).equals(B.get(1))) {
                lines.add(new LineItem(Type.ADDED, B.get(0)));
                B.remove(0);
                if (A.isEmpty() || B.isEmpty()) {
                    break;
                }
            }
        }
        if (!A.isEmpty()) {
            lines.add(new LineItem(Type.REMOVED, A.get(0)));
        } else if (!B.isEmpty()) {
            lines.add(new LineItem(Type.ADDED, B.get(0)));
        }
    }

    public static ArrayList<String> readList(String path) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while (bufferedReader.ready()) {
            list.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        return list;
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
