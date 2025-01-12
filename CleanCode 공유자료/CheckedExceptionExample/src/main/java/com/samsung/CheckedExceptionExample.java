package com.samsung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to read a file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("File Content: " + line);
            reader.close();
        } catch (IOException e) {
            // Handle the exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

