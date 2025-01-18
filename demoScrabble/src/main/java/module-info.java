module com.example.demoscrabble {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires json.simple;
    requires java.desktop;

    exports controllers;
    opens controllers to javafx.fxml;
    exports modelo;
    opens modelo to javafx.fxml;
}