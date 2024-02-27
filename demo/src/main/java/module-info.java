module com.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.demo to javafx.fxml;
    exports com.demo;
}