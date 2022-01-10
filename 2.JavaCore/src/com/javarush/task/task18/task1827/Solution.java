package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean goOn = check(args);
        if (goOn) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
//            String fileName = "G:\\1.txt";
            reader.close();
            int id = idnum(fileName);


            if (id == 0) {
                String newLine = create(++id, args[1], args[2], args[3]);
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true));
                out.write(newLine.getBytes());
                out.flush();
                out.close();
            } else {
                String newLine = create(++id, args[1], args[2], args[3]);
                String lineSeparator = System.getProperty("line.separator");
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true));
                out.write(lineSeparator.getBytes());
                out.write(newLine.getBytes());
                out.flush();
                out.close();
            }
        }


    }


    public static String create(int id, String productName, String price, String quantity) {
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

    public static int idnum(String fileName) throws IOException {
        int max = 0;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                int check = Integer.parseInt(strLine.substring(0, 8).trim());
                if (check > max) max = check;
            }
            fis.close();
            br.close();
        } catch (IOException e) {

        }
        return max;
    }

    public static boolean check(String[] list) {
        if (list.length == 0 || !list[0].equals("-c") || list.length < 4) {
            return false;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                return false;
            }
        }
        return true;
    }


}
