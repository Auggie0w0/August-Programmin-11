package com.motivationapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class FileManagerTest {

    @Test
    void testLoadQuotes_FileExists() {
        FileManager fileManager = new FileManager();
        List<Quote> quotes = fileManager.loadQuotes();
        assertFalse(quotes.isEmpty(), "Quotes list should not be empty");
        // Further assertions can be made on the content of the quotes, such as checking for the presence of known quotes
    }

    @Test
    void testLoadQuotes_FileDoesNotExist() {
        FileManager fileManager = new FileManager();
        Exception exception = assertThrows(IllegalStateException.class, fileManager::loadQuotes,
                "Expected loadQuotes to throw, but it didn't");

        String expectedMessage = "Resource not found";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
