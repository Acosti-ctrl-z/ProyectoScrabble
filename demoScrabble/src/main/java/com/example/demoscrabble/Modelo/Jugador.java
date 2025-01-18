package com.example.demoscrabble.Modelo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Jugadores, usado solo en las partidas
 */
public class Jugador {
    private Usuario usuario;
    private List<Ficha> fichas;
    private int puntajePartida;
    private int palabrasPartida;
    private int saltos;

    /**Clase Jugador, que se encarga de inicializar el codigo
     * @param usuario Jugador
     */
    public Jugador(Usuario usuario) {
        this.usuario = usuario;
        this.fichas = new ArrayList();
        this.puntajePartida = 0;
        this.palabrasPartida = 0;
        this.saltos = 0;
    }

    /**
     * muestra las fichas en la mano del jugador
     */
    public void mostrarFichas() {
        System.out.println("Jugador " + this.usuario.getAlias() + ", sus fichas son: ");
        Iterator var1 = this.fichas.iterator();

        while(var1.hasNext()) {
            Ficha ficha = (Ficha)var1.next();
            System.out.print(ficha.getLetra() + ", ");
        }

        System.out.print("\n");
    }

    /**
     * muestra los datos del usuario
     */
    public void mostrarDatos() {
        this.usuario.mostrarDatos();
    }

    /**
     * getter del alias del jugador
     * @return alias del jugador, llamando al alias del usuario
     */
    public String getName() {
        return this.usuario.getAlias();
    }

    /**
     * asigna una lista de fichas como nueva mano al jugador
     * @param fichas lista de fichas que se van a asignar
     */
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    /**
     * getter del puntaje del jugador en la partida actual
     * @return valor del atributo puntajePartida del jugador
     */
    public int getPuntajePartida() {
        return this.puntajePartida;
    }

    /**
     * setter del puntaje acumulado en la partida
     * @param puntajePartida el puntaje que el jugador acumulo en la partida
     */
    public void setPuntajePartida(int puntajePartida) {
        this.puntajePartida = puntajePartida;
    }

    /**
     * getter de las palabras que ha colocado el jugador en la partida actual
     * @return valor del atributo palabrasPartida del usuario
     */
    public int getPalabrasPartida() {
        return this.palabrasPartida;
    }

    /**
     * setter de las palabras que el jugador ha colocado en la partida
     * @param palabrasPartida palabras que el jugador ha colocado en la partida
     */
    public void setPalabrasPartida(int palabrasPartida) {
        this.palabrasPartida = palabrasPartida;
    }

    /**
     * getter de la cantidad de saltos que lleva el jugador
     * @return la cantiddd de saltos que lleva el jugador
     */
    public int getSaltos() {
        return this.saltos;
    }

    /**
     * setter de los saltos que lleva el jugador
     * @param saltos veces seguidas que el jugador ha saltado
     */
    public void setSaltos(int saltos) {
        this.saltos = saltos;
    }

    /**
     * getter de la lista de fichas en la mano del jugador
     * @return fichas en la mano del jugador
     */
    public List<Ficha> getFichas() {
        return this.fichas;
    }

    /**
     * Agrega una ficha a la mano del jugador
     * @param ficha que se va a agregar
     */
    public void agregarFicha(Ficha ficha) {
        this.fichas.add(ficha);
    }
}
