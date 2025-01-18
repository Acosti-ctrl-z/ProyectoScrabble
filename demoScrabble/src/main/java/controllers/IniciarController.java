package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Jugador;
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

    ListaUsuarios users = new ListaUsuarios();
    Jugador jugador1;
    Jugador jugador2;

    @FXML
    public Jugador verificar(String nombre){
        Jugador retornar = null;
        Iterator buscar = this.users.getListaUsuarios().iterator();

        Usuario usuario = (Usuario)buscar.next();
        if (usuario.getAlias().equals(nombre)) {
            retornar = new Jugador(usuario);
            return retornar;
        }
        else{
            return retornar;
        }
    }

    public void onIniciarPartida() throws IOException {
        this.jugador1 = this.verificar(playerOneText.getText());
        this.jugador2 = this.verificar(playerTwoText.getText());
        if (this.jugador1!=null && this.jugador2!=null){
            Stage stage = (Stage) BotonPartida.getScene().getWindow();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("tablero.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        }
        else{
            agregarText.setText("Nombre de usuario no encontrado, intente de nuevo.");
        }
    }
}
