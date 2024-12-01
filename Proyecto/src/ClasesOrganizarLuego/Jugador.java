package ClasesOrganizarLuego;

import java.util.List;

public class Jugador {

    private Usuario usuario;
    private Ficha[] fichas;
    private int puntajePartida;
    private int palabrasPartida;
    //Tiempo que ha durado en partidas


    public Jugador(Usuario usuario) {
        this.usuario=usuario;

    }

    public void mostrarDatos(){
        usuario.mostrarDatos();
    }

    public String getName(){
        return usuario.getAlias();
    }
}
