package com.aman.lab5.ex2;
import java.util.Scanner;

public class EmployeeNameValidator {

    public static void validateName(
            String firstName,
            String lastName)
            throws NameException {

        if (firstName == null ||
                firstName.trim().isEmpty()) {

            throw new NameException(
                    "First Name cannot be blank");
        }

        if (lastName == null ||
                lastName.trim().isEmpty()) {

            throw new NameException(
                    "Last Name cannot be blank");
        }

        System.out.println(
                "Employee Name is Valid");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        try {

            validateName(
                    firstName,
                    lastName);

        } catch (NameException e) {

            System.out.println(
                    e.getMessage());
        }

        sc.close();
    }
}
