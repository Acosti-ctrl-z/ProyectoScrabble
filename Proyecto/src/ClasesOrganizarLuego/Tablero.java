package ClasesOrganizarLuego;

import java.util.List;

public class Tablero {
    private Ficha[][] tablero;

    public Tablero() {
        this.tablero = new Ficha[15][15];
        for(int i=0; i<=14; i+=1){
            for(int j=0; j<=14; j+=1){
                tablero[i][j]= new Ficha(" ",0);
            }
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
