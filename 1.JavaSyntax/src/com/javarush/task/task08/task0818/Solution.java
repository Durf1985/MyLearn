package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        int zp = 480;
        for (int i = 0; i < 10; i++) {
            map.put("" + i, zp);
            zp += 10;
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}

/*
Только для богачей
*/
