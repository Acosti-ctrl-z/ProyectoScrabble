package ClasesOrganizarLuego;

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
        for(int i=1; i<=9; i+=1){
            System.out.print(" "+i+"  ");
        }
        for(int i=10; i<=15; i+=1){
            System.out.print(" "+i+" ");
        }
        System.out.print("\n");
        int i=1;
        for(Ficha[] fila:tablero){
            if(i<10){
            System.out.print(""+i+" ");}
            else{
                System.out.print(""+i+"");
            }
            for(Ficha ficha:fila){
                System.out.print(" "+ficha.getLetra()+"| ");
            }i+=1;
            System.out.print("\n");
        }
    }

    public void colocarFicha(Ficha ficha, int fila, int columna){
        this.tablero[fila-1][columna-1]=ficha;
    }

}
