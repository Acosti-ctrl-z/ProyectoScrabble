package Controllers;

import Command.Boton;
import Command.Commands;
import Command.Device;
import Command.EstadisticasMostrarCommand;
import Modelo.LectorJson;
import Modelo.ListaUsuarios;
import Modelo.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.Objects;

/**
 * Controlador del archivo fxml Estadisticas
 */
public class EstadisticasController {

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
    private ListaUsuarios users = new ListaUsuarios();

    @FXML
    private Label estadisticasText;

    @FXML
    private TextField indiceJtext;

    @FXML
    private Label nombreText;

    @FXML
    private Label correoText;

    @FXML
    private Label palabrasText;

    @FXML
    private Label puntajeText;

    @FXML
    private Label partidasText;

    @FXML
    private ListView<String> viewNames=new ListView<String>();

    @FXML
    private ListView<String> viewCorreo=new ListView<String>();

    @FXML
    private ListView<String> viewPuntaje=new ListView<String>();

    @FXML
    private ListView<String> viewPartidas=new ListView<String>();

    @FXML
    /**
     * método para mostrar los datos de un jugador
     */
    protected void estadisticasJugador(){

        Device device = new Device();
        Commands estadisticasMostrar = new EstadisticasMostrarCommand(device);
        Boton boton = new Boton();
        this.users = LectorJson.leerDatos(this.users, "ListaUsuarios");

        ObservableList<String> observableAlias =FXCollections.observableArrayList();
        for(Usuario user: this.users.getListaUsuarios()){
            observableAlias.add(user.getAlias());
        }
        viewNames.setItems(observableAlias);

        ObservableList<String> observableCorreo =FXCollections.observableArrayList();
        for(Usuario user: this.users.getListaUsuarios()){
            observableCorreo.add(user.getCorreo());
        }
        viewCorreo.setItems(observableCorreo);
        ObservableList<String> observablePuntos =FXCollections.observableArrayList();
        for(Usuario user: this.users.getListaUsuarios()){
            observablePuntos.add(Integer.toString(user.getPuntajeAcumulado()));
        }
        viewPuntaje.setItems(observablePuntos);
        ObservableList<String> observablePartidas =FXCollections.observableArrayList();
        for(Usuario user: this.users.getListaUsuarios()){
            observablePartidas.add(Integer.toString(user.getPartidasGanadas()));
        }
        viewPartidas.setItems(observablePartidas);
    }
}
