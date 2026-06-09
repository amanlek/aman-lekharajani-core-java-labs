package com.aman.lab5.ex1;
import java.util.Scanner;

public class AgeValidator {

    public static void validateAge(int age) throws AgeException {

        if (age <= 15) {
            throw new AgeException(
                    "Age should be above 15");
        }

        System.out.println(
                "Age is valid for registration");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}