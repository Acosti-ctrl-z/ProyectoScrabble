package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import modelo.Ficha;
import modelo.Partida;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class PartidaController {
    @FXML
    private GridPane gridPane;

    @FXML
    private Partida partida;

    @FXML
    private Button botonJugar;

    @FXML
    private Button botonSaltar;

    @FXML
    private Button botonRefrescar;

    @FXML
    private Label agregarText;

    @FXML
    protected int onJugar() throws IOException {
        return 1;
    }

    @FXML
    protected int onSaltar() throws IOException {
        return 2;
    }

    @FXML
    protected int onRefrescar() throws IOException {
        return 3;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public void initialize() {
        int numRows = 15;
        int numCols = 15;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                Button button = new Button();
                ImageView imageView = new ImageView();

                imageView.setFitWidth(25);
                imageView.setFitHeight(25);

                button.setGraphic(imageView);
                gridPane.add(button, col, row);
            }
        }
    }

}
