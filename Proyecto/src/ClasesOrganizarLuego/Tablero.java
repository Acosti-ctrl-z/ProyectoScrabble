package ClasesOrganizarLuego;

import java.util.List;

public class Tablero {
    private Ficha[][] tablero;

    public Tablero() {
        this.tablero = new Ficha[15][15];
        for(int i=0; i<=14; i+=1){
            for(int j=0; j<=14; j+=1){
                tablero[i][j]= new Ficha(' ');
            }
        }
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

    public void mostrarTablero(){
        for(Ficha[] fila:tablero){
            for(Ficha ficha:fila){
                System.out.print(ficha.getLetra());
            }
            System.out.print("\n");
        }
    }

}
