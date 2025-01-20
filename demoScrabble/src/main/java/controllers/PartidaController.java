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
import modelo.Jugador;
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
    private Jugador jugadorActivo;

    @FXML
    private Button botonJugar;

    @FXML
    private Button botonSaltar;

    @FXML
    private Button botonRefrescar;

    @FXML
    private Label labelJugadorTurno;

    @FXML
    private Label labelPuntosJugador;

    @FXML
    protected void onJugar() throws IOException {
        partida.setOrden(3);
    }

    @FXML
    protected void onSaltar() throws IOException {
        if(jugadorActivo==null){jugadorActivo=this.partida.getPrimerJugador();
        }
        jugadorActivo.setSaltos(jugadorActivo.getSaltos()+1);
        this.cambioTurno();
    }

    @FXML
    protected void onRefrescar() throws IOException {
        if(jugadorActivo==null){jugadorActivo=this.partida.getPrimerJugador();
        }
        partida.getBolsa().refrescarPiezas(jugadorActivo);
        jugadorActivo.setSaltos(jugadorActivo.getSaltos()+1);
        this.cambioTurno();
    }

    protected void cambioTurno() throws IOException {
        if(jugadorActivo==null){jugadorActivo=this.partida.getPrimerJugador();
        }
        if(jugadorActivo==partida.getJugador1()){
            jugadorActivo=partida.getJugador2();
        }else{
            jugadorActivo=partida.getJugador1();
        }
        labelJugadorTurno.setText("Jugador del turno: "+jugadorActivo.getName());
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

                button.setMinWidth(42);
                button.setMinHeight(33);
                button.setMaxWidth(42);
                button.setMaxHeight(33);

                gridPane.add(button, col, row);
            }
        }
    }

}
