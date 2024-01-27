module com.example.productmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.productmanagement to javafx.fxml;
    exports com.example.productmanagement;
}