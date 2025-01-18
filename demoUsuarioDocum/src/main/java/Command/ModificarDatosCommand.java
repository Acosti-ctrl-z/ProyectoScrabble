package Command;

import javafx.scene.control.Label;

public class ModificarDatosCommand implements Commands{

    private Device device;
    /**
     * constructor de la clase ModificarDatosCommand
     * @param device el dispositivo al que se le darán las órdenes
     */
    public ModificarDatosCommand(Device device) {
        this.device = device;
    }

    /**
     * método para dar la orden de modificar datos al dispositivo
     * @param label que se ingresará en la ejecución
     */
    @Override
    public void execute(Label label) {
        device.modificarDatos(label);
    }
}
