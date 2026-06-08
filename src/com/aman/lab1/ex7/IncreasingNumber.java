package com.aman.lab1.ex7;
import java.util.Scanner;

public class IncreasingNumber {

    public boolean checkNumber(int number) {
        int prevNum = 10; 

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit > prevNum) {
                return false;
            }

            prevNum = currentDigit;
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        IncreasingNumber obj = new IncreasingNumber();

        if (obj.checkNumber(number)) {
            System.out.println(number + " is an Increasing Number");
        } else {
            System.out.println(number + " is NOT an Increasing Number");
        }

        sc.close();
    }
}