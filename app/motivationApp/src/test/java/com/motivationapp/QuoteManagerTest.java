package com.motivationapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuoteManagerTest {
    private QuoteManager quoteManager;

    @BeforeEach
    void setUp() {
        FileManager fileManager = new FileManager(); // Assuming FileManager does not rely on external files here
        quoteManager = new QuoteManager(fileManager);
    }

    @Test
    void testGetRandomQuote_NotEmpty() {
        Quote quote = quoteManager.getRandomQuote();
        assertNotNull(quote, "Random quote should not be null");
        assertNotEquals("No quotes available", quote.getText(), "Random quote text should not be the default empty message");
    }
}
