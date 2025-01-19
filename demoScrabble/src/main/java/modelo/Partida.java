package modelo;

/**
 * La clase que se encarga de iniciar y llevar a cabo las partidas
 */
public class Partida implements Iniciable {
    private Bolsa bolsa;
    private Jugador jugador1;
    private Jugador jugador2;
    //tiempo que ha durado la partida

    /** Iniciar de la partida
     * @param jugador1 Jugador 1 dentro de la partida
     * @param jugador2 Jugador 2 dentro de la partida
     */
    public Partida(Jugador jugador1, Jugador jugador2){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        System.out.println("Partida iniciada por: "+jugador1.getName()+" y "+jugador2.getName());
    }

    /** El metodo iniciar() toma al azar uno de los juadores para deteerminar el orden de la partida
     */
    public void iniciar(){

        System.out.println("Se procederán a repartir las fichas");
        bolsa=new Bolsa();
        bolsa.repartirFichas(jugador1);
        bolsa.repartirFichas(jugador2);

        if (Math.random() * 1==0){
            jugar(jugador1,jugador2);
        }else{
            jugar(jugador2,jugador1);
        }
    }

    /** El metodo jugar() llama los turnos fde los jugadores
     * @param player1 Jugador 1
     * @param player2 Jugador 2
     */
    public void jugar(Jugador player1, Jugador player2){
        boolean terminarJuego=false;
        while(!terminarJuego){
            turno(player1);
            turno(player2);
            if(acabado()){
                terminarJuego=true;
            }
        }
        System.out.println("Fin del juego. ");
    }

    /** El metodo turno() se encarga de ejecutar el turno del jugador activo
     * @param jugador Cualquiera de los dos jugadores
     */
    public void turno(Jugador jugador){
        boolean salir=false;
        if(jugador.getFichas().size()<7){
            bolsa.repartirFichas(jugador);
        }
        jugador.mostrarFichas();
        while (!salir) {
            System.out.println("Qué desea hacer?: ");
            System.out.println("1. Colocar piezas.");
            System.out.println("2. Refrescar piezas y saltar turno.");
            System.out.println("3. Saltar turno.");
        }
    }

    /** El metodo colocarLetras() se encarga de poner las letras del scrabble
     * @param jugador Jugador
     * @return aprobar la letra para colocarla en la matriz (booleano)
     */
    public boolean colocarLetras(Jugador jugador){
        //no le paren bola a ese return
        return false;
    }

    /**El metodo acabado() terminar la partida luego de dos saltos de turno
     * @return valor booleano que determinar el final de la partida
     */
    public boolean acabado() {
        if ((this.jugador1.getSaltos() >= 2 && this.jugador2.getSaltos() >= 2) || ((jugador1.getFichas().isEmpty() || jugador2.getFichas().isEmpty()) && bolsa.getDisponibles().isEmpty())) {
            return true;
        } else {
            return false;
        }
    }
}
