package com.motivationapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.io.IOException;

public class HelloController {
    // UI components linked via @FXML annotations
    @FXML private Button motivationbtn;
    @FXML private Label motivationlbl;
    @FXML private ColorPicker colorPicker;
    @FXML private Button submitbtn;
    @FXML private TextField authorTextField;
    @FXML private TextField quoteTextField;
    @FXML private Label statusLabel;

    private QuoteManager quoteManager;

    // Method called automatically upon FXML loading
    @FXML
    public void initialize() {
        FileManager fileManager = new FileManager();
        quoteManager = new QuoteManager(fileManager);
        // Display a random quote at startup
        displayRandomQuote();
    }

    // Displays a random quote or a placeholder text if none available
    private void displayRandomQuote() {
        Quote randomQuote = quoteManager.getRandomQuote();
        if(randomQuote != null) {
            motivationlbl.setText(randomQuote.toString());
        } else {
            motivationlbl.setText("No quote available.");
        }
    }

    // Changes the background color of the motivation label based on the color picker's value
    @FXML
    public void submit_color(ActionEvent actionEvent) {
        Color color = colorPicker.getValue();
        String webColor = String.format("#%02X%02X%02X",
                (int)(color.getRed() * 255),
                (int)(color.getGreen() * 255),
                (int)(color.getBlue() * 255));

        motivationlbl.setStyle("-fx-background-color: " + webColor + ";");
        String message = determineColorType(color);
        showAlert("Color Choice", message);
    }

    // Determines the type of color selected and returns an appropriate message
    private String determineColorType(Color color) {
        boolean isWarm = color.getRed() > color.getBlue();
        boolean isCool = color.getBlue() > color.getRed();

        if (isWarm) {
            return "Nice choice for a warm color!";
        } else if (isCool) {
            return "Cool choice for a cool color!";
        } else {
            return "Interesting choice!";
        }
    }

    // Adds a new quote to the quote manager
    @FXML
    private void add_quote() {
        String text = quoteTextField.getText();
        String author = authorTextField.getText();
        if (!text.isEmpty() && !author.isEmpty()) {
            quoteManager.addQuote(new Quote(text, author));
            statusLabel.setText("Quote added.");
            // Optionally clear the text fields after adding
            quoteTextField.clear();
            authorTextField.clear();
        } else {
            statusLabel.setText("Both quote and author are required.");
        }
    }

    // Saves all quotes to the file
    @FXML
    private void save_quotes() {
        try {
            quoteManager.saveQuotes();
            statusLabel.setText("Quotes saved.");
        } catch (IOException e) {
            statusLabel.setText("Failed to save quotes.");
            // Consider logging the stack trace or showing a more detailed error message
            e.printStackTrace();
        }
    }

    // Shows an alert dialog with the given title and content
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    // Refreshes the displayed quote with another random quote
    @FXML
    public void get_motivation(ActionEvent actionEvent) {
        displayRandomQuote();
    }
}