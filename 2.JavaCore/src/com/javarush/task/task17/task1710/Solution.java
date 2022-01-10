package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    allPeople.add(Create(args[1], args[2], args[3]));
                    System.out.println(allPeople.size() - 1);
                    break;
                case "-u":
                    Update(args[1], args[2], args[3], args[4]);

                    break;
                case "-d":
                    Delete(args[1]);
                    break;
                case "-i":
                    printInfo(args[1]);
                    break;
            }
        }
    }

    public static Person Create(String name, String sex, String bd) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        Person person = sex.equals("м") ? Person.createMale(name, date) : Person.createFemale(name, date);
        return person;
    }

    public static void Update(String id, String name, String sex, String bd) throws ParseException {
        int index = Integer.parseInt(id);
        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        allPeople.get(index).setName(name);
        if (sex.equals("м")) {
            allPeople.get(index).setSex(Sex.MALE);
        } else {
            allPeople.get(index).setSex(Sex.FEMALE);
        }
        allPeople.get(index).setBirthDate(date);
    }

    public static void Delete(String id) {
        int index = Integer.parseInt(id);
        if (index <= allPeople.size()) {
            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setBirthDate(null);
        }
    }

    public static void printInfo(String id) {
        int index = Integer.parseInt(id);
        String sex;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (index <= allPeople.size()) {
            Person person = allPeople.get(index);
            if (person.getSex().equals(Sex.MALE)) {
                sex = "м";
            } else {
                sex = "ж";
            }
            System.out.println(person.getName() + " " + sex + " " + simpleDateFormat.format(person.getBirthDate()));
        }
    }


}
