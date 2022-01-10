package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {


    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("F:\\1.txt"));
        PersonScannerAdapter psa = new PersonScannerAdapter(scanner);
        Person person = psa.read();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String s = fileScanner.nextLine();
            String[] list = s.split(" ", 4);
            Date britd = new SimpleDateFormat("d M y", Locale.ENGLISH).parse(list[3]);

            return new Person(list[1],list[2],list[0], britd);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }


}
