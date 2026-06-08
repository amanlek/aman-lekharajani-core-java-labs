package com.aman.lab2.ex4;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public int[] modifyArray(int[] arr) {

        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        RemoveDuplicates obj = new RemoveDuplicates();

        int[] result = obj.modifyArray(arr);

        System.out.println("Array after removing duplicates and in descending order:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}