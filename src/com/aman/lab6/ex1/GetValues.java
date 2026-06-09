package com.aman.lab6.ex1;
import java.util.*;

public class GetValues {

    public static List<String> getValues(HashMap<Integer, String> map) {

        List<String> list = new ArrayList<>(map.values());
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Orange");
        map.put(2, "Apple");
        map.put(3, "Banana");

        System.out.println(getValues(map));
    }
}
