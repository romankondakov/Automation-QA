package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrinter {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(1, "Orange");
        map.put(2, "Banana");

        printMap(map);
    }

    public static void printMap(Map<Integer, String> map) {

        Map<Integer, String> sortedMap = new TreeMap<>(map);
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}