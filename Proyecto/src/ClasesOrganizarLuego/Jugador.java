package ClasesOrganizarLuego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jugador {
    private Usuario usuario;
    private List<Ficha> fichas;
    private int puntajePartida;
    private int palabrasPartida;
    private int saltos;

    public Jugador(Usuario usuario) {
        this.usuario = usuario;
        this.fichas = new ArrayList();
        this.puntajePartida = 0;
        this.palabrasPartida = 0;
        this.saltos = 0;
    }

    public void mostrarFichas() {
        System.out.println("Jugador " + this.usuario.getAlias() + ", sus fichas son: ");
        Iterator var1 = this.fichas.iterator();

        while(var1.hasNext()) {
            Ficha ficha = (Ficha)var1.next();
            System.out.print(ficha.getLetra() + ", ");
        }

        System.out.print("\n");
    }

    public void mostrarDatos() {
        this.usuario.mostrarDatos();
    }

    public String getName() {
        return this.usuario.getAlias();
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public int getPuntajePartida() {
        return this.puntajePartida;
    }

    public void setPuntajePartida(int puntajePartida) {
        this.puntajePartida = puntajePartida;
    }

    public int getPalabrasPartida() {
        return this.palabrasPartida;
    }

    public void setPalabrasPartida(int palabrasPartida) {
        this.palabrasPartida = palabrasPartida;
    }

    public int getSaltos() {
        return this.saltos;
    }

    public void setSaltos(int saltos) {
        this.saltos = saltos;
    }

    public List<Ficha> getFichas() {
        return this.fichas;
    }

    public void agregarFicha(Ficha ficha) {
        this.fichas.add(ficha);
    }
}
