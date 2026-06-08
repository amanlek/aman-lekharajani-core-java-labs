package com.aman.lab3.ex9;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDuration {

    public static void printDuration(LocalDate date) {

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(date, currentDate);

        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        printDuration(date);

        sc.close();
    }
}