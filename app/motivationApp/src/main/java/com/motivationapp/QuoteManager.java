package com.motivationapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages the operations related to quotes, including loading, adding, saving, and retrieving random quotes.
 */
public class QuoteManager {
    // List to hold quotes loaded from the file or added during runtime
    private List<Quote> quotes;

    // FileManager instance for file operations
    private FileManager fileManager;

    /**
     * Constructor initializes the QuoteManager with quotes loaded from the file.
     * @param fileManager FileManager instance responsible for reading and writing quotes to the file.
     */
    public QuoteManager(FileManager fileManager) {
        this.fileManager = fileManager;
        // Load quotes from file through FileManager
        this.quotes = fileManager.loadQuotes();
    }

    /**
     * Adds a new quote to the list.
     * @param quote The quote to be added.
     */
    public void addQuote(Quote quote) {
        quotes.add(quote);
    }

    /**
     * Saves all quotes back to the file.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public void saveQuotes() throws IOException {
        fileManager.saveQuotes(quotes);
    }

    /**
     * Retrieves a random quote from the list.
     * If no quotes are available, returns a default message.
     * @return A random Quote object, or a default Quote if the list is empty.
     */
    public Quote getRandomQuote() {
        if (quotes.isEmpty()) {
            return new Quote("No quotes available.", "");
        }
        int index = (int) (Math.random() * quotes.size());
        return quotes.get(index);
    }
}
