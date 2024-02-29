package com.motivationapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuoteTest {

    @Test
    void testCreateQuote() {
        String text = "Be yourself; everyone else is already taken.";
        String author = "Oscar Wilde";
        Quote quote = new Quote(text, author);

        assertEquals(text, quote.getText(), "Quote text should match the text passed to the constructor");
        assertEquals(author, quote.getAuthor(), "Quote author should match the author passed to the constructor");
    }

    @Test
    void testQuoteToString() {
        String text = "Be yourself; everyone else is already taken.";
        String author = "Oscar Wilde";
        Quote quote = new Quote(text, author);

        String expectedToString = "\"" + text + "\" - " + author;
        assertEquals(expectedToString, quote.toString(), "Quote toString should match the expected format");
    }
}