package com.aman.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {

    public String[] sortStrings(String[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int mid = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        for (int i = 0; i < mid; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        for (int i = mid; i < n; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        StringSorting obj = new StringSorting();
        String[] result = obj.sortStrings(arr);

        System.out.println("Resulting Array:");
        for (String str : result) {
            System.out.println(str);
        }

        sc.close();
    }
}
