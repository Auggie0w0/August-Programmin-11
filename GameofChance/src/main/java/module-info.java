module com.gameofchance {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gameofchance to javafx.fxml;
    exports com.gameofchance;
}