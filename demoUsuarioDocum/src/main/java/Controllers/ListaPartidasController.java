package Controllers;

import Command.Boton;
import Command.Commands;
import Command.Device;
import Command.ListaPartidaCommand;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * Controlador del archivo fxml ListaPartidas
 */
public class ListaPartidasController {

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
    private Label listaText;

    /**
     * método para mostrar la lista de partidas
     */
    @FXML
    protected void listaPartidas(){
        Device device = new Device();
        Commands lista = new ListaPartidaCommand(device);
        Boton boton = new Boton();

        boton.setCommands(lista);
        boton.pressButton(listaText);
    }
}
