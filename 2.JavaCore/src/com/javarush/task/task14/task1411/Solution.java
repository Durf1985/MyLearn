package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        for (int i = 0; i < 4; i++) {
            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger")) {
                switch (key) {
                    case "user":
                        person = new Person.User();
                        doWork(person);
                        break;
                    case "loser":
                        person = new Person.Loser();
                        doWork(person);
                        break;
                    case "coder":
                        person = new Person.Coder();
                        doWork(person);
                        break;
                    case "proger":
                        person = new Person.Proger();
                        doWork(person);
                        break;
                }
            } else break;
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {// обращение сначала к интерфейсу, потом к классу
            ((Person.User) person).live();// можно сделать статический импорт и не писать обращение к интерфейсу
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
