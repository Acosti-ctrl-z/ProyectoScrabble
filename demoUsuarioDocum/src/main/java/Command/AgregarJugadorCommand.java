package Command;

import javafx.scene.control.Label;

/**
 * commando conreto para agregar jugador
 */
public class AgregarJugadorCommand implements Commands {
    private Device device;

    /**
     * constructor de la clase AgregarJugadorCommand
     * @param device el dispositivo al que se le darán las órdenes
     */
    public AgregarJugadorCommand(Device device) {
        this.device = device;
    }

    /**
     * método para ejecutar la orden del dispositivo
     * @param label label que será modificado por la orden
     */
    @Override
    public void execute(Label label) {
        device.agregarJugador(label);
    }
}
