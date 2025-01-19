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
    public void confimarJugador(Label label) {
        label.setText("Los jugadores estan disponibles");

    }
    /**
     * Setter del texto de la label para cuando se agrega un jugador incorrecto
     * @param label a la que se le asignará el texto
     */
    public void errorJugador(Label label){
        label.setText("Alguno de los jugadores no estan registrados");
    }

}
