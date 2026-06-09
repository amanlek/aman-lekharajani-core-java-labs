package com.aman.lab6.ex6;

import java.time.*;
import java.util.*;

public class VoterList {

    public static List<Integer>
    votersList(Map<Integer, LocalDate> map) {

        List<Integer> voters =
                new ArrayList<>();

        LocalDate today = LocalDate.now();

        for(Map.Entry<Integer,LocalDate> entry
                : map.entrySet()) {

            int age =
                    Period.between(
                            entry.getValue(),
                            today).getYears();

            if(age > 18)
                voters.add(entry.getKey());
        }

        return voters;
    }

    public static void main(String[] args) {

        Map<Integer,LocalDate> map =
                new HashMap<>();

        map.put(101,
                LocalDate.of(2000,1,10));

        map.put(102,
                LocalDate.of(2012,5,20));

        map.put(103,
                LocalDate.of(1998,8,15));

        System.out.println(
                votersList(map));
    }
}