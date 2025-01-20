package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * Controlador del archivo fxml Menu
 */
public class MenuController {
    @FXML
    private Button BotonAgregar;

    /**
     * controlador para el botón de agregar a un usuario
     * @throws IOException excepcion del sistema
     */
    @FXML
    protected void onAgregarUsuarioClick() throws IOException {
        Stage stage = (Stage) BotonAgregar.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AgregarUsuario.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    private Button BotonEstadisticas;

    /**
     * controlador para el botón de ver estadísticas de usuario
     * @throws IOException excepcion del sistema
     */
    @FXML
    protected void onVerEstadisticasClick() throws IOException {
        Stage stage = (Stage) BotonEstadisticas.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Estadisticas.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    private Button BotonModificar;

    /**
     * controlador para el botón de modificar datos de un usuario
     * @throws IOException excepcion del sistema
     */
    @FXML
    protected void onModificarDatosClick() throws IOException {
        Stage stage = (Stage) BotonModificar.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ModificarDatos.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    private Button BotonEliminar;

    /**
     * controlador para el botón de eliminar a un usuario
     * @throws IOException excepcion del sistema
     */
    @FXML
    protected void onEliminarJugadorClick() throws IOException {
        Stage stage = (Stage) BotonEliminar.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EliminarJugador.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    private Button BotonLista;

    @FXML
    private Button BotonSalir;

    /**
     * controlador para el botón de mostrar lista de jugadores
     * @throws IOException excepcion del sistema
     */
    @FXML
    protected void onMostrarListaClick() throws IOException {
        Stage stage = (Stage) BotonLista.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ListaPartidas.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    protected void initialize() {
        BotonSalir.setOnAction(event -> System.exit(0));
    }
}
