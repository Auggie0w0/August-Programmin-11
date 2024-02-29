package com.motivationapp;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private static final String QUOTES_FILE_PATH = "/Users/augustlam/Documents/GitHub/August-Programmin-11/app/motivationApp/src/main/resources/com/motivationapp/quotes.txt";

    public List<Quote> loadQuotes() {
        List<Quote> quotes = new ArrayList<>();
        File file = new File(QUOTES_FILE_PATH);

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Correctly splitting the line using a hyphen
                String[] parts = line.split(" - ");
                if (parts.length == 2) {
                    // Trim the parts to remove any leading or trailing whitespace
                    String text = parts[0].trim();
                    String author = parts[1].trim();
                    quotes.add(new Quote(text, author));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the quotes file: " + QUOTES_FILE_PATH);
            e.printStackTrace();
        }
        return quotes;
    }

    public void saveQuotes(List<Quote> quotes) {

    }
}