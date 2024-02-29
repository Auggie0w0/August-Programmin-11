package com.motivationapp;

public class Quote {
    private String text;
    private String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    // Getter for text
    public String getText() {
        return text;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // A method to display the quote
    @Override
    public String toString() {
        return "\"" + text + "\" - " + author;
    }
}
