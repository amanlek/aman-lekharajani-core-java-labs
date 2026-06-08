package com.aman.lab1.ex3;
import java.util.Scanner; 

public class Fibonacci {

    public static int fibonacciRecursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciNonRecursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 1, b = 1, c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Nth Fibonacci number (Recursive): " + fibonacciRecursive(n));

        System.out.println("Nth Fibonacci number (Non-Recursive): "+fibonacciNonRecursive(n));

        sc.close();
    }
}