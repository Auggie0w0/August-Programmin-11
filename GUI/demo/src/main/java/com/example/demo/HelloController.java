package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField textgetname;
    public Button btngetname;
    public Button calculation;
    public Button subtract;
    public Button add;
    public TextField textadd;
    public TextField textsubtract;
    public double total = 0;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void printName(ActionEvent actionEvent) {
        String name = textgetname.getText();
        System.out.println(name);
    }

    public void add(ActionEvent actionEvent) {
        double num = Double.parseDouble(textadd.getText());
        total += num;
        System.out.println(total);
        textadd.clear();
    }

    public void subtract(ActionEvent actionEvent) {
        double num = Double.parseDouble(textsubtract.getText());
        total -= num;
        System.out.println(total);
        textsubtract.clear();
    }
}