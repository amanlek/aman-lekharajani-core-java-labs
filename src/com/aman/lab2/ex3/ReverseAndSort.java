package com.aman.lab2.ex3;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSort {

    public int[] getSorted(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String str = Integer.toString(arr[i]);
            String rev = new StringBuilder(str).reverse().toString();
            arr[i] = Integer.parseInt(rev);
        }

        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ReverseAndSort obj = new ReverseAndSort();
        int[] result = obj.getSorted(arr);

        System.out.println("Sorted Array after reversing:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
