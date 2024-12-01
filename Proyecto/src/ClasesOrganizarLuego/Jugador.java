package ClasesOrganizarLuego;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private Usuario usuario;
    private List<Ficha> fichas;
    private int puntajePartida;
    private int palabrasPartida;
    private int saltos;
    //Tiempo que ha durado en partidas


    public Jugador(Usuario usuario) {
        this.usuario=usuario;
        this.fichas= new ArrayList<>();
        this.puntajePartida=0;
        this.palabrasPartida=0;
        this.saltos=0;

    }

    public void mostrarDatos(){
        usuario.mostrarDatos();
    }

    public String getName(){
        return usuario.getAlias();
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public int getPuntajePartida() {
        return puntajePartida;
    }

    public void setPuntajePartida(int puntajePartida) {
        this.puntajePartida = puntajePartida;
    }

    public int getPalabrasPartida() {
        return palabrasPartida;
    }

    public void setPalabrasPartida(int palabrasPartida) {
        this.palabrasPartida = palabrasPartida;
    }

    public int getSaltos() {
        return saltos;
    }

    public void setSaltos(int saltos) {
        this.saltos = saltos;
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void agregarFicha(Ficha ficha){
        fichas.add(ficha);
    }

}
