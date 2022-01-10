package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()) {

            String readString = reader.readLine().trim().replaceAll("( [ ])", "");
            if (!readString.isEmpty()) {
                String[] name = readString.replaceAll("( [-] )|( [-])|([-] )", "-").split("\\d.+");

                Pattern pattern = Pattern.compile("[\\d].*");
                Matcher matcher = pattern.matcher(readString);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
                Date date1 = null;
                while (matcher.find()) {
                    String date = readString.substring(matcher.start(), matcher.end());
                    date1 = simpleDateFormat.parse(date);
                }
                PEOPLE.add(new Person(name[0].trim(), date1));
            }
        }
//        for (Person person :
//                PEOPLE) {
//            System.out.println(person.getName() + " " + person.getBirthDate());
//        }
        reader.close();
    }
}

