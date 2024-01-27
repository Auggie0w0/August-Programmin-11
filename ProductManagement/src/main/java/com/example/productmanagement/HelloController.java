package com.example.productmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField textGetName;
    public TextField textGetQuantity;
    public TextField textGetCost;
    public Button btnAddProduct;
    public ListView<Product> productList = new ListView<>();
    public Button preproduction;
    public Label lblCost;
    public Label lblQuant;
    public Label lblName;
    public Button btnPurchase;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void addproduct(ActionEvent actionEvent) {
        String name = textGetName.getText();
        int quant = Integer.parseInt(textGetQuantity.getText());
        double cost = Double.parseDouble((textGetCost.getText()));
        Product temp = new Product(name, quant, cost);
        productList.getItems().add(temp);
        textGetName.clear();
        textGetCost.clear();
        textGetQuantity.clear();
        btnPurchase.setDisable(true);
    }

    public void displayProduct(MouseEvent mouseEvent) {
        Product temp;
        temp = productList.getSelectionModel().getSelectedItem();
        lblCost.setText("$" + Double.toString(temp.getCost()));
        lblName.setText(temp.name);
        lblQuant.setText(Integer.toString(temp.getQuantity()));
        btnPurchase.setDisable(false);
    }

    public void purchaseProduct(ActionEvent actionEvent) {
        Product temp;
        temp = productList.getSelectionModel().getSelectedItem();
        temp.purchase();
    }
}