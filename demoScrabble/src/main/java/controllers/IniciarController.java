package controllers;

import Command.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Jugador;
import modelo.LectorJson;
import modelo.ListaUsuarios;
import modelo.Usuario;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class IniciarController {
    @FXML
    private Button BotonRegresar;

    /**
     * controlador para el botón de regresar al menú
     * @throws IOException excepcion del sistema
     */
    @FXML
    protected void onRegresarMenu() throws IOException {
        Stage stage = (Stage) BotonRegresar.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    private Button BotonPartida;

    @FXML
    private TextField playerOneText;

    @FXML
    private TextField playerTwoText;

    @FXML
    private Label agregarText;

    @FXML
    private ListaUsuarios users = new ListaUsuarios();

    @FXML
    private Jugador jugador1;

    @FXML
    private Jugador jugador2;


    @FXML
    public Jugador verificar(String nombre) {

        this.users = LectorJson.leerDatos(this.users, "ListaUsuarios");
        System.out.println(this.users.getListaUsuarios());
        for (Usuario usuario : this.users.getListaUsuarios()) {
            if (usuario.getAlias().equals(nombre)) {
                return new Jugador(usuario);
            }
        }
        return null;
    }

    @FXML
    public void onIniciarPartida() throws IOException {
        Device device = new Device();
        Commands  confirmarJugador = new ConfirmarJugadorCommand(device);
        Commands  errorJugador = new ErrorJugadorCommand(device);
        Boton boton = new Boton();

        this.jugador1 = verificar(playerOneText.getText());
        this.jugador2 = verificar(playerTwoText.getText());

        if (this.jugador1!=null && this.jugador2!=null){
            boton.setCommands(confirmarJugador);
            boton.pressButton(agregarText);

            Stage stage = (Stage) BotonPartida.getScene().getWindow();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("tablero.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } else{
            boton.setCommands(errorJugador);
            boton.pressButton(agregarText);
        }
    }
}
