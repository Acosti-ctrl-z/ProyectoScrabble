package Command;

import javafx.scene.control.Label;

/**
 * Clase dspositivo para las labels
 */
public class Device {
    /**
     * Setter del texto de la label para cuando se agrega un jugador
     * @param label a la que se le asignará el texto
     */
    public void agregarJugador(Label label) {
        label.setText("El jugador a sido registrado");

    }
    /**
     * Setter del texto de la label para cuando se muestran las estadísticas
     * @param label a la que se le asignará el texto
     */
    public void estadisticasMostrar(Label label) {
        label.setText("Mostrando estadisticas");
    }
    /**
     * Setter del texto de la label para cuando se modifican datos de un jugador
     * @param label a la que se le asignará el texto
     */
    public void modificarDatos(Label label) {
        label.setText("Datos modificados");

    }
    /**
     * Setter del texto de la label para cuando se elimina un jugador
     * @param label a la que se le asignará el texto
     */
    public void eliminarJugador(Label label) {
        label.setText("El jugador a sido eliminado");
    }
    /**
     * Setter del texto de la label para cuando se muestra la lista de partidas
     * @param label a la que se le asignará el texto
     */
    public void listaPartdia(Label label) {
        label.setText("Mostrando Partidas");
    }

}
