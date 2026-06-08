package com.aman.lab1.ex6;
import java.util.Scanner;

public class DifferenceCalculator {

    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        int squareOfSum = sum * sum;

        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        DifferenceCalculator obj = new DifferenceCalculator();
        int result = obj.calculateDifference(n);

        System.out.println("Difference = " + result);

        sc.close();
    }
}