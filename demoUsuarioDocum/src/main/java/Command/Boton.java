package Command;

import javafx.scene.control.Label;

/**
 * Comando concreto para el botón
 */
public class Boton{

    private Commands commands;

    /**
     * setter del command
     * @param commands el command que se le asigna al botón
     */
    public void setCommands(Commands commands) {
        this.commands = commands;
    }

    /**
     * Método para ejecutar el command
     * @param label label que será modificada
     */
    public void pressButton(Label label) {
        commands.execute(label);
    }
}
