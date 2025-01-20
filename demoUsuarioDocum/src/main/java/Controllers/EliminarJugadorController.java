package Controllers;

import Command.Boton;
import Command.Commands;
import Command.Device;
import Command.EliminarJugadorCommand;
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
 * Controlador del archivo fxml EliminarJugador
 */
public class EliminarJugadorController {
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
        stage.setFullScreen(true);
    }
    @FXML
    private Label eliminarText;

    @FXML
    private ListaUsuarios users = new ListaUsuarios();

    @FXML
    private TextField indiceJtext;

    /**
     * método para eliminar un jugador
     */
    @FXML
    protected void eliminarJugador(){
        Device device = new Device();
        Commands eliminar = new EliminarJugadorCommand(device);
        Boton boton = new Boton();

        this.users = LectorJson.leerDatos(this.users, "ListaUsuarios");
        int indice = Integer.parseInt(indiceJtext.getText());
        if (users.getListaUsuarios() != null && !users.getListaUsuarios().isEmpty()) {
            while(true) {
                if (indice >= 1 && indice <= users.getListaUsuarios().size()) {
                    System.out.println("Objetivo encontrado.");
                    users.getListaUsuarios().remove(indice - 1);
                    EscritorJson.guardarDatos(this.users, "ListaUsuarios");
                    boton.setCommands(eliminar);
                    boton.pressButton(eliminarText);
                    break;
                }
                eliminarText.setText("Objetivo inválido, vuelva a intentar.");
            }
        } else {
            System.out.println("No hay ningún usuario registrado");
        }
    }
}
