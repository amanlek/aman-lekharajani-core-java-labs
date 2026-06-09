package com.aman.lab6.ex4;

import java.util.*;

public class GetStudents {

    public static HashMap<Integer,String>
    getStudents(HashMap<Integer,Integer> marksMap) {

        HashMap<Integer,String> medalMap =
                new HashMap<>();

        for(Map.Entry<Integer,Integer> entry :
                marksMap.entrySet()) {

            int marks = entry.getValue();

            if(marks >= 90)
                medalMap.put(entry.getKey(), "Gold");

            else if(marks >= 80)
                medalMap.put(entry.getKey(), "Silver");

            else if(marks >= 70)
                medalMap.put(entry.getKey(), "Bronze");
        }

        return medalMap;
    }

    public static void main(String[] args) {

        HashMap<Integer,Integer> map =
                new HashMap<>();

        map.put(101, 95);
        map.put(102, 82);
        map.put(103, 75);
        map.put(104, 60);

        System.out.println(getStudents(map));
    }
}
