package ClasesOrganizarLuego;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
    private List<Ficha> disponibles = new ArrayList();

    public List<Ficha> getDisponibles() {
        return this.disponibles;
    }

    public Bolsa() {
        int i;
        for(i = 1; i <= 12; ++i) {
            this.disponibles.add(new Ficha("A", 1));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("B", 4));
        }

        for(i = 1; i <= 4; ++i) {
            this.disponibles.add(new Ficha("C", 3));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("CH", 8));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("D", 3));
        }

        for(i = 1; i <= 12; ++i) {
            this.disponibles.add(new Ficha("E", 1));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("F", 5));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("G", 3));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("H", 5));
        }

        for(i = 1; i <= 6; ++i) {
            this.disponibles.add(new Ficha("I", 1));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("J", 10));
        }

        for(i = 1; i <= 4; ++i) {
            this.disponibles.add(new Ficha("L", 2));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("LL", 8));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("M", 3));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("N", 2));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Ñ", 10));
        }

        for(i = 1; i <= 9; ++i) {
            this.disponibles.add(new Ficha("O", 1));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("P", 4));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Q", 8));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("R", 2));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("RR", 8));
        }

        for(i = 1; i <= 6; ++i) {
            this.disponibles.add(new Ficha("S", 1));
        }

        for(i = 1; i <= 4; ++i) {
            this.disponibles.add(new Ficha("T", 2));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("U", 5));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("V", 4));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("X", 10));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Y", 5));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Z", 10));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("&", 0));
        }

    }

    public void repartirFichas(Jugador jugador) {
        while(jugador.getFichas().size() < 7 && this.disponibles.size() > 1) {
            int i = (int)(Math.random() * (double)this.disponibles.size());
            jugador.agregarFicha((Ficha)this.disponibles.get(i));
            this.disponibles.remove(i);
        }

    }

    public void refrescarPiezas(Jugador jugador) {
        jugador.getFichas().clear();
        this.repartirFichas(jugador);
    }
}

