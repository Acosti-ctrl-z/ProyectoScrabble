package com.example.demoscrabble.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class MenuController {

    @FXML
    private Button BotonIniciar;

    @FXML
    protected void onIniciar() throws IOException {
        Stage stage = (Stage) BotonIniciar.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("tablero.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    private Button BotonSalir;

    @FXML
    protected void onSalir() {
        BotonSalir.setOnAction(event -> System.exit(0));
    }
}
