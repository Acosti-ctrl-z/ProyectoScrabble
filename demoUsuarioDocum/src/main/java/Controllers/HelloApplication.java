package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**Clase "Main" que ejecuta el programa
 * para poder usarlo
 * @author Jesus Acosta
 * @author Rolando Rodrigo
 * @author Leonel Rojas
 */
public class HelloApplication extends Application {
    /**
     *preparación de escenario y escena para correre el programa
     * @param stage escenario del programa
     * @throws IOException excepción obligatoria
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.setFullScreen(true);
        stage.show();
    }
    /**Main, instancia y ejecuta el launch
     * @param args parametro obligatorio del main
     */
    public static void main(String[] args) {
        launch();
    }
}