package Command;

import javafx.scene.control.Label;

public class ErrorJugadorCommand implements Commands{
    private Device device;

    /**
     * constructor de la clase ErrorJugadorCommand
     * @param device el dispositivo al que se le darán las órdenes
     */
    public ErrorJugadorCommand(Device device) {
        this.device = device;
    }

    /**
     * método para ejecutar la orden del dispositivo
     * @param label label que será modificado por la orden
     */
    @Override
    public void execute(Label label) {
        device.errorJugador(label);
    }
}
