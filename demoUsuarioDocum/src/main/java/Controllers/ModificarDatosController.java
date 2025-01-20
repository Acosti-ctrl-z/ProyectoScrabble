package Controllers;

import Command.Boton;
import Command.Commands;
import Command.Device;
import Command.ModificarDatosCommand;
import Modelo.EscritorJson;
import Modelo.LectorJson;
import Modelo.ListaUsuarios;
import Modelo.Usuario;
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
 * Controlador del archivo fxml ModificarDatos
 */
public class ModificarDatosController {

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
    private TextField nombreJtext;

    @FXML
    private TextField correoJtext;

    @FXML
    private ListaUsuarios users = new ListaUsuarios();

    @FXML
    private TextField indiceJtext;
    @FXML
    private Label datosText;

    /**
     * método para modificar los datos de un jugador
     */
    @FXML
    protected void modificarDatos(){

        Device device = new Device();
        Commands modificar = new ModificarDatosCommand(device);
        Boton boton = new Boton();

        String name = nombreJtext.getText();
        String email = correoJtext.getText();
        this.users = LectorJson.leerDatos(this.users, "ListaUsuarios");
        int indice = Integer.parseInt(indiceJtext.getText());
        if (users.getListaUsuarios() != null && !users.getListaUsuarios().isEmpty()) {
            if (indice >= 1 && indice <= users.getListaUsuarios().size()) {
                System.out.println("Objetivo encontrado.");
                Usuario aModificar = (Usuario)users.getListaUsuarios().get(indice - 1);
                aModificar.modificarDatos(name, email);
                users.getListaUsuarios().set(indice - 1, aModificar);
                EscritorJson.guardarDatos(this.users, "ListaUsuarios");
                boton.setCommands(modificar);
                boton.pressButton(datosText);
            } else {
                datosText.setText("Objetivo no encontrado, vuelva a intentar.");
            }
        } else {
            System.out.println("No hay ningún usuario registrado");
        }
    }
}
