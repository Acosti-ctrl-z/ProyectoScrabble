package Command;

import javafx.scene.control.Label;

/**
 * commando concreto de la lista de partidas
 */
public class ListaPartidaCommand implements Commands{

    private Device device;
    /**
     * constructor de la clase ListaPartidaCommand
     * @param device el dispositivo al que se le darán las órdenes
     */
    public ListaPartidaCommand(Device device) {
        this.device = device;
    }

    /**
     * método que da la orden listaPartida al dispositivo
     * @param label que se ingresará en la ejecución
     */
    @Override
    public void execute(Label label) {
        device.listaPartdia(label);
    }
}
