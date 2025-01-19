package Command;

import javafx.scene.control.Label;

/**
 * Interfaz que define el comportamiento de los commands
 */
public interface Commands {
    /**
     * método que usarán las clases que lo implementan
     * @param label que se ingresará en cada ejecución
     */
    void execute(Label label);
}
