package Controllers;

import Command.AgregarJugadorCommand;
import Command.Boton;
import Command.Commands;
import Command.Device;
import Modelo.EscritorJson;
import Modelo.LectorJson;
import Modelo.ListaUsuarios;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * Controlador del archivo fxml AgregarUsuario
 */

public class AgregarUsuarioController {
    @FXML
    private Button BotonRegresar;

    /**
     * controlador para el botón de regresar al menú
     * @throws IOException excepcion del sistema
     */
    @FXML
    protected void onRegresarMenuClick() throws IOException {
        Stage stage = (Stage) BotonRegresar.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Menu.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    private TextField nombreJtext;

    @FXML
    private TextField correoJtext;

    @FXML
    private ListaUsuarios users = new ListaUsuarios();

    @FXML
    private Label agregarText;

    /**
     * método para registrar un jugador
     */
    @FXML
    protected void registroJugador(){
        Device device = new Device();
        Commands agregarJugador = new AgregarJugadorCommand(device);
        Boton boton = new Boton();

        this.users = LectorJson.leerDatos(this.users, "ListaUsuarios");
        String name = nombreJtext.getText();
        String email = correoJtext.getText();
        this.users.agregarUsuarioNuevo(name, email);
        EscritorJson.guardarDatos(this.users, "ListaUsuarios");

        boton.setCommands(agregarJugador);
        boton.pressButton(agregarText);
    }
}
