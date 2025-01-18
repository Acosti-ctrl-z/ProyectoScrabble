module com.example.demoscrabble {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires json.simple;
    requires java.desktop;

    exports com.example.demoscrabble;
    opens com.example.demoscrabble to javafx.fxml;
    exports com.example.demoscrabble.controller;
    opens com.example.demoscrabble.controller to javafx.fxml;
    exports com.example.demoscrabble.Modelo;
    opens com.example.demoscrabble.Modelo to javafx.fxml;
}