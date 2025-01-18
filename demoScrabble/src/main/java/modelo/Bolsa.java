package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Maneja las fichas de la partida que no pertenece a ningun jugador y los metodos pertinentes
 */
public class Bolsa {
    private List<Ficha> disponibles = new ArrayList();

    /**getter de las fichas disponibles
     *
     * @return la lista de fichas en la bolsa
     */
    public List<Ficha> getDisponibles() {
        return this.disponibles;
    }

    /**
     * Constructor de la bolsa, la rellena con las fichas y sus puntajes
     */
    public Bolsa() {
        int i;
        for(i = 1; i <= 12; ++i) {
            this.disponibles.add(new Ficha("A", 1, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraA.PNG"));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("B", 4, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraB.PNG"));
        }

        for(i = 1; i <= 4; ++i) {
            this.disponibles.add(new Ficha("C", 3, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraC.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("CH", 8, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraCH.PNG"));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("D", 3, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraD.PNG"));
        }

        for(i = 1; i <= 12; ++i) {
            this.disponibles.add(new Ficha("E", 1, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraE.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("F", 5,"C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraF.PNG"));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("G", 3, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraF.PNG"));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("H", 5, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraH.PNG"));
        }

        for(i = 1; i <= 6; ++i) {
            this.disponibles.add(new Ficha("I", 1, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraI.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("J", 10, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraJ.PNG"));
        }

        for(i = 1; i <= 4; ++i) {
            this.disponibles.add(new Ficha("L", 2, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraL.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("LL", 8, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraLL.PNG"));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("M", 3, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraM.PNG"));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("N", 2, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraN.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Ñ", 10, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraÑ.PNG"));
        }

        for(i = 1; i <= 9; ++i) {
            this.disponibles.add(new Ficha("O", 1, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraO.PNG"));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("P", 4, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraP.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Q", 8, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraQ.PNG"));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("R", 2, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraR.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("RR", 8, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraRR.PNG"));
        }

        for(i = 1; i <= 6; ++i) {
            this.disponibles.add(new Ficha("S", 1, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraS.PNG"));
        }

        for(i = 1; i <= 4; ++i) {
            this.disponibles.add(new Ficha("T", 2, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraT.PNG"));
        }

        for(i = 1; i <= 5; ++i) {
            this.disponibles.add(new Ficha("U", 5, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraU.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("V", 4, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraV.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("X", 10, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraX.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Y", 5, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraY.PNG"));
        }

        for(i = 1; i <= 1; ++i) {
            this.disponibles.add(new Ficha("Z", 10, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\LetraZ.PNG"));
        }

        for(i = 1; i <= 2; ++i) {
            this.disponibles.add(new Ficha("&", 0, "C:\\Users\\User\\IdeaProjects\\demoScrabble\\src\\LetrasScrabble\\LetrasScrabble\\Letra&.PNG"));
        }

    }
    /**da fichas al jugador si tiene menos de 7
     * @param jugador Usuario que esta jugando
     */
    public void repartirFichas(Jugador jugador) {
        while(jugador.getFichas().size() < 7 && this.disponibles.size() > 1) {
            int i = (int)(Math.random() * (double)this.disponibles.size());
            jugador.agregarFicha((Ficha)this.disponibles.get(i));
            this.disponibles.remove(i);
        }

    }

    /**Vacia las fichas del juhador y le da nuevas fichas
     * @param jugador Usuario que esta jugando
     */
    public void refrescarPiezas(Jugador jugador) {
        jugador.getFichas().clear();
        this.repartirFichas(jugador);
    }
}

