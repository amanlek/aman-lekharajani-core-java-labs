package com.aman.lab6.ex5;
import java.util.*;

public class GetSecondSmallest {

    public static int getSecondSmallest(int[] arr) {

        ArrayList<Integer> list =
                new ArrayList<>();

        for(int n : arr)
            list.add(n);

        Collections.sort(list);

        return list.get(1);
    }

    public static void main(String[] args) {

        int arr[] = {12,5,7,1,9};

        System.out.println(
                getSecondSmallest(arr));
    }
}
