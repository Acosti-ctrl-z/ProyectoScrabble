package ClasesOrganizarLuego;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private Usuario usuario;
    private List<Ficha> fichas;
    private int puntajePartida;
    private int palabrasPartida;
    //Tiempo que ha durado en partidas


    public Jugador(Usuario usuario) {
        this.usuario=usuario;
        this.fichas= new ArrayList<>();

    }

    public void mostrarDatos(){
        usuario.mostrarDatos();
    }

    public String getName(){
        return usuario.getAlias();
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void agregarFicha(Ficha ficha){
        fichas.add(ficha);
    }
}
