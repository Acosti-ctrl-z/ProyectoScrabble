package ClasesOrganizarLuego;

public class Partida implements Iniciable{
    private Tablero tablero;
    private Bolsa bolsa;
    private Jugador jugador1;
    private Jugador jugador2;
    //tiempo que ha durado la partida

    public Partida(Jugador jugador1, Jugador jugador2){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        System.out.println("Partida iniciada por: "+jugador1.getName()+" y "+jugador2.getName());
        this.tablero=new Tablero();
    }

    public void iniciar(){
        tablero.mostrarTablero();
    }
}
