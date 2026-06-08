package com.aman.lab2.ex1;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

    public int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
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

        SecondSmallest obj = new SecondSmallest();
        int result = obj.getSecondSmallest(arr);

        System.out.println("Second Smallest Element: " + result);

        sc.close();
    }
}
