package com.aman.lab1.ex2;
import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Traffic Light Simulator");
        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("STOP");
                break;

            case 2:
                System.out.println("READY");
                break;

            case 3:
                System.out.println("GO");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
