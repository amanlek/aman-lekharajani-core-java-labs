package com.aman.lab1.ex8;

import java.util.Scanner;

public class PowerOfTwo {

    public boolean checkNumber(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PowerOfTwo obj = new PowerOfTwo();

        if (obj.checkNumber(n)) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }

        sc.close();
    }
}
