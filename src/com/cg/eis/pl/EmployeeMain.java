package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServuceImpl;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        EmployeeService service = new EmployeeServuceImpl();

        String scheme = service.getInsuranceScheme(salary, designation);

        Employee emp = new Employee(id, name, salary, designation, scheme);

        service.displayEmployee(emp);

        sc.close();
    }
}