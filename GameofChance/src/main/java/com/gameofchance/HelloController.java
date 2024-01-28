package com.gameofchance;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.util.Random;

public class HelloController {


    public ListView losesList;
    public ListView winList;
    public Button startbtn;
    public Label lblDice;
    public Label lblGuess;
    public Button higherbtn;
    public Button lowerbtn;
    private Random random = new Random();
    private int currentDiceRoll;

    public void start(MouseEvent event) {
        int diceRoll = random.nextInt(6) + 1; // Roll the dice
        lblGuess.setText(String.valueOf(diceRoll));
        currentDiceRoll = diceRoll; // Store the current roll to use in guess comparison
        higherbtn.setDisable(false); // Enable the guess buttons
        lowerbtn.setDisable(false);
        startbtn.setDisable(true); // Disable the start button to prevent re-rolling
    }

    public void guessHigher(ActionEvent actionEvent) {
    processGuess(true);
    }

    public void guessLower(ActionEvent actionEvent) {
        processGuess(false);
    }

    private void processGuess(boolean guessedHigher) {
        int newDiceRoll = random.nextInt(6) + 1; // Roll the dice for the second time
        boolean win = (guessedHigher && newDiceRoll > currentDiceRoll) ||
                (!guessedHigher && newDiceRoll < currentDiceRoll);

        String guess = guessedHigher ? "HIGHER" : "LOWER";
        String resultMessage = "First roll: " + currentDiceRoll +
                " | Second roll: " + newDiceRoll +
                " | Guessed: " + guess;

        if (win) {
            winList.getItems().add(resultMessage + " - Win");
        } else {
            losesList.getItems().add(resultMessage + " - Lose");
        }

        // Prepare for the next round
        higherbtn.setDisable(true);
        lowerbtn.setDisable(true);
        startbtn.setDisable(false); // Re-enable the START button

    }
}

