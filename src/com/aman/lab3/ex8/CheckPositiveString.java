package com.aman.lab3.ex8;
import java.util.Scanner;

public class CheckPositiveString {

    public static boolean isPositiveString(String str) {

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) <= str.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine().toUpperCase();

        if (isPositiveString(str))
            System.out.println("Positive String");
        else
            System.out.println("Not a Positive String");

        sc.close();
    }
}
