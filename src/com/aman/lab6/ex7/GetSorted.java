package com.aman.lab6.ex7;

import java.util.*;

public class GetSorted {

    public static int reverseNumber(int num) {

        int rev = 0;

        while(num > 0) {

            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;
    }

    public static int[] getSorted(int[] arr) {

        ArrayList<Integer> list =
                new ArrayList<>();

        for(int n : arr)
            list.add(reverseNumber(n));

        Collections.sort(list);

        int result[] =
                new int[list.size()];

        for(int i=0;i<list.size();i++)
            result[i] = list.get(i);

        return result;
    }

    public static void main(String[] args) {

        int arr[] =
                {12,34,56,78};

        System.out.println(
                Arrays.toString(
                        getSorted(arr)));
    }
}
