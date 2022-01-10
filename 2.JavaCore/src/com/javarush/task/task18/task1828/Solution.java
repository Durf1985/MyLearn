package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(fileName);
        List<String> lines = Files.readAllLines(Paths.get(fileName));
//        List<String> lines = Files.readAllLines(Paths.get("F:/1.txt"));
        if (checkEmpty(args)) {
            switch (args[0]) {
                case "-d":
                    lines = removeLine(lines, args[1]);
                    break;
                case "-u":
                    lines = updateLine(lines, args);
                    break;
            }
        }
//        PrintWriter out = new PrintWriter(new FileWriter("F:/1.txt"));
        PrintWriter out = new PrintWriter(new FileWriter(fileName));
        for (int i = 0; i < lines.size(); i++) {
            if (i == lines.size() - 1) {
                out.print(lines.get(i));
            } else {
                out.println(lines.get(i));
            }
        }
        fis.close();
        out.close();

    }


    private static List<String> removeLine(List<String> list, String idnum) {
        int id = Integer.parseInt(idnum);
        for (int i = 0; i < list.size(); i++) {
            int listLine = Integer.parseInt(list.get(i).substring(0, 8).trim());
            if (id == listLine) {
                list.remove(i);
                break;
            }
        }
        return list;
    }

    private static List<String> updateLine(List<String> list, String[] paramLaunch) {
        int id = Integer.parseInt(paramLaunch[1]);
        for (int i = 0; i < list.size(); i++) {
            int listLine = Integer.parseInt(list.get(i).substring(0, 8).trim());
            if (id == listLine) {
                String update = formateString(paramLaunch[1], paramLaunch[2], paramLaunch[3], paramLaunch[4]);
                list.set(i, update);
                break;
            }
        }
        return list;
    }

    private static String formateString(String id, String productName, String price, String quantity) { // форматер строки взят из задачи 1827 которая прошла валидацию
        StringBuffer sbId = new StringBuffer();
        sbId.append(id);

        if (sbId.length() > 8) {
            sbId.delete(8, sbId.length());
        } else {
            while (sbId.length() < 8) {
                sbId.append(" ");
            }
        }
        StringBuffer pN = new StringBuffer();
        pN.append(productName);
        if (pN.length() > 30) {
            pN.delete(30, pN.length());
        } else {
            while (pN.length() < 30) {
                pN.append(" ");
            }
        }

        StringBuffer pr = new StringBuffer();
        pr.append(price);
        if (pr.length() > 8) {
            pr.delete(8, pr.length());
        } else {
            while (pr.length() < 8) {
                pr.append(" ");
            }
        }
        StringBuffer quant = new StringBuffer();
        quant.append(quantity);
        if (quant.length() > 4) {
            quant.delete(4, quant.length());
        } else {
            while (quant.length() < 4) {
                quant.append(" ");
            }
        }
        sbId.append(pN);
        sbId.append(pr);
        sbId.append(quant);

        String x = sbId.toString();

        return x;
    }

    private static boolean checkEmpty(String[] list) {   // проверка параметров запуска
        for (String s : list) {
            if (s.equals("")) {
                return false;
            }
        }
        return list[0].equals("-d") && list.length == 2 || list[0].equals("-u") && list.length == 5;
    }

}

