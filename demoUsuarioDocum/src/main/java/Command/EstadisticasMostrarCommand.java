package Command;

import javafx.scene.control.Label;

/**
 * commando concreto de mostrar estadísticas
 */
public class EstadisticasMostrarCommand implements Commands{

    private Device device;

    /**
     * constructor del comando concreto
     * @param device dispositivo que se le asignará al comando
     */
    public EstadisticasMostrarCommand(Device device) {
        this.device = device;
    }

    /**
     * método que dará la orden al device
     * @param label que se modificará cuando se lleve a cabo
     */
    @Override
    public void execute(Label label) {
        device.estadisticasMostrar(label);
    }
}
