package com.aman.lab1.ex5;
import java.util.Scanner;

public class SumCalculator {

    public int calculateSum(int n) {
        int sum = 0;
        int count = 0;
        int num = 1;

        while (count < n) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
                count++;
            }
            num++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        SumCalculator obj = new SumCalculator();
        int result = obj.calculateSum(n);

        System.out.println("Sum = " + result);

        sc.close();
    }
}
