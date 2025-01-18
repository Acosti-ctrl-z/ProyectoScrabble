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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    /**
     * método para mostrar los datos de un jugador
     */
    protected void estadisticasJugador(){
        Device device = new Device();
        Commands estadisticasMostrar = new EstadisticasMostrarCommand(device);
        Boton boton = new Boton();

        this.users = LectorJson.leerDatos(this.users, "ListaUsuarios");
        int indice = Integer.parseInt(indiceJtext.getText());
        if (users.getListaUsuarios()!= null && !users.getListaUsuarios().isEmpty()) {
            if (indice >= 1 && indice <= users.getListaUsuarios().size()) {
                System.out.println("Objetivo encontrado.");
                Usuario user = users.getListaUsuarios().get(indice - 1);
                nombreText.setText("Nombre: " + user.getAlias());
                correoText.setText("Correo: " +user.getCorreo());
                palabrasText.setText("Palabras Jugadas: " + user.getPalabrasJugadas());
                puntajeText.setText("Puntaje obetenido: " + user.getPuntajeAcumulado());
                partidasText.setText("Partidas Ganadas: " + user.getPartidasGanadas());
                boton.setCommands(estadisticasMostrar);
                boton.pressButton(estadisticasText);
            } else {
                estadisticasText.setText("Objetivo no encontrado, vuelva a intentar.");
            }
        } else {
            System.out.println("No hay ningún usuario registrado");
        }
    }
}
