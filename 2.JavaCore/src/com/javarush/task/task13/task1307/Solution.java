package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {

    }

    interface SimpleObject<T> { // наверно Map <x,y> так же меняется в HashMap на <Key,Value>
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject <String>
    {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}