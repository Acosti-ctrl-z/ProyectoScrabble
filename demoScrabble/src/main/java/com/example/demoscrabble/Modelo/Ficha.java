package com.example.demoscrabble.Modelo;
import javafx.scene.image.Image;
/**
 * Cada ficha individual del juego
 */
public class Ficha {
    private String letra;
    private int puntaje;
    private Image imagen;

    /** Se crean las fichas para el juego
     * @param letra Letra del abecedario
     * @param puntaje puntaje de la ficha
     */
    public Ficha(String letra, int puntaje, String rutaImagen) {
        this.letra = letra;
        this.puntaje = puntaje;
        this.imagen=new Image (rutaImagen);
    }

    /**
     * getter de la letra de una ficha
     * @return la letra de la ficha
     */
    public String getLetra() {
        return this.letra;
    }
    /**
     * getter del puntaje de una ficha
     * @return del valor de la ficha
     */
    public int getPuntaje() {
        return this.puntaje;
    }

    /**
     * setter de la letra de la ficha
     * @param letra que se le asignara a la ficha
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }
    /**
     * setter del puntaje de la ficha
     * @param puntaje que se le asignara a la ficha
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
}
