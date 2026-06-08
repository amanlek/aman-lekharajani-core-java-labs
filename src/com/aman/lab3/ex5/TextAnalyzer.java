package com.aman.lab3.ex5;
import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (type END on a new line to stop):");

        StringBuilder text = new StringBuilder();
        int lines = 0;

        while (true) {
            String line = sc.nextLine();

            if (line.equals("END"))
                break;

            text.append(line).append("\n");
            lines++;
        }

        String content = text.toString();

        int characters = content.replace("\n", "").length();

        String[] words = content.trim().split("\\s+");
        int wordCount = content.trim().isEmpty() ? 0 : words.length;

        System.out.println("Characters: " + characters);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lines);

        sc.close();
    }
}