package Command;

import javafx.scene.control.Label;

/**
 * command concreto para eliminar un jugador
 */
public class EliminarJugadorCommand implements Commands{

    private Device device;

    /**
     * constructor de la clase
     * @param device device que se usará para eliminar el jugador
     */
    public EliminarJugadorCommand(Device device) {
        this.device = device;
    }
    /**
     * método que le da la orden al device
     * @param label que se mostrará cuando se ejecute la orden
     */
    @Override
    public void execute(Label label) {
        device.eliminarJugador(label);
    }
}
