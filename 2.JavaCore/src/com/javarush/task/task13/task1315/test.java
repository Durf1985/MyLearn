package com.javarush.task.task13.task1315;

import java.util.ArrayList;

public class test {
    class MyClass
    {
        private ArrayList<Integer> list;
        public void write(int data)
        {
            list.add(data);
        }
        public int read()
        {
            int first = list.get(0);
            list.remove(0);
            return first;
        }

        public int available()
        {
            return list.size();
        }
    }
}
