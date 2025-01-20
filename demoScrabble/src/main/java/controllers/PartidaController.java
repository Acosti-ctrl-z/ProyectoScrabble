package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import modelo.Ficha;

import java.util.Iterator;

public class PartidaController {
    @FXML
    private GridPane gridPane;

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
