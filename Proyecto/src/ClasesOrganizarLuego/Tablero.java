package ClasesOrganizarLuego;

import java.util.List;

public class Tablero {
    private Ficha[][] tablero;

    public Tablero() {
        this.tablero = new Ficha[15][15];
    }
    
    public void colocarFichaHorizontal(List<Ficha> colocar, int fila, int primeraPosicion){
        for(Ficha ficha:colocar){
            tablero[fila][primeraPosicion]=ficha;
            primeraPosicion+=1;
        }
    }

    public void colocarFichaVertical(List<Ficha> colocar, int fila, int primeraPosicion){
        for(Ficha ficha:colocar){
            tablero[fila][primeraPosicion]=ficha;
            primeraPosicion+=1;
        }
    }

}
