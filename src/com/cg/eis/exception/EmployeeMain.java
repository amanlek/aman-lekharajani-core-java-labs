package com.cg.eis.exception;
import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

public class EmployeeMain {

    public static void validateSalary(double salary) throws EmployeeException {

        if (salary < 3000) {
            throw new EmployeeException("Salary should not be less than 3000.");
        }

        System.out.println("Salary is valid.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        try {
            validateSalary(salary);
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}