package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length - 1; i += 3) {
                            allPeople.add(Create(args[i], args[i + 1], args[i + 2]));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length - 1; i += 4) {
                            Update(args[i], args[i + 1], args[i + 2], args[i + 3]);
                        }
                    }

                    break;
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Delete(args[i]);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            printInfo(args[i]);
                        }
                    }
                    break;
            }
        }
    }

    private static Person Create(String name, String sex, String bd) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        Person person = sex.equals("м") ? Person.createMale(name, date) : Person.createFemale(name, date);
        return person;
    }

    public static void Delete(String id) {
        int index = Integer.parseInt(id);
        if (index <= allPeople.size()) {
            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setBirthDate(null);
        }
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
