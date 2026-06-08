package com.aman.lab3.ex3;
import java.util.Scanner;

public class AlterString {

    public static String alterString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);

                if (lower != 'a' && lower != 'e' && lower != 'i' &&
                    lower != 'o' && lower != 'u') {
                    ch = (char) (ch + 1);
                }
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Modified String: " + alterString(str));

        sc.close();
    }
}