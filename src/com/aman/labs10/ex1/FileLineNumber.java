package com.aman.labs10.ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineNumber {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {

                System.out.println(lineNumber + " : " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}