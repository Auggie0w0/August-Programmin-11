module com.motivationapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.motivationapp to javafx.fxml;
    exports com.motivationapp;
}