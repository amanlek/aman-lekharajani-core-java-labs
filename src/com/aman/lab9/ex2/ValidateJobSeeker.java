package com.aman.lab9.ex2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateJobSeeker {

    public static boolean validateUserName(String userName) {

        String regex = "^[A-Za-z0-9]{8,}_job$";

        return Pattern.matches(regex, userName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String userName = sc.nextLine();

        if (validateUserName(userName)) {
            System.out.println("True");
            System.out.println("Username is valid.");
        } else {
            System.out.println("False");
            System.out.println("Username is invalid.");
        }

        sc.close();
    }
}
