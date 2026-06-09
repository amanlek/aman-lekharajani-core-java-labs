package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServuceImpl implements EmployeeService {

    @Override
    public String getInsuranceScheme(double salary, String designation) {

        if (salary > 5000 && salary < 20000
                && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        }

        else if (salary >= 20000 && salary < 40000
                && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        }

        else if (salary >= 40000
                && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        }

        else if (salary < 5000
                && designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        }

        return "No Scheme";
    }

    @Override
    public void displayEmployee(Employee employee) {
        System.out.println("\nEmployee Details");
        System.out.println("ID : " + employee.getId());
        System.out.println("Name : " + employee.getName());
        System.out.println("Salary : " + employee.getSalary());
        System.out.println("Designation : " + employee.getDesignation());
        System.out.println("Insurance Scheme : " + employee.getInsuranceScheme());
    }
}
