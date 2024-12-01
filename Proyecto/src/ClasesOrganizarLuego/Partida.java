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

    public void jugar(Jugador player1, Jugador player2){
        boolean terminarJuego=false;
        while(!terminarJuego){
            turno(player1);
            turno(player2);
            if(acabado()){
                terminarJuego=false;
            }
        }
    }

    public void turno(Jugador jugador){
        boolean salir=false;
        System.out.println("Jugador "+jugador.getName()+", sus fichas son: ");
        for(Ficha ficha:jugador.getFichas()){
            System.out.print(ficha.getLetra()+", ");
        }
        while (!salir) {
            System.out.println("Qué desea hacer?: ");
            System.out.println("1. Colocar una pieza.");
            System.out.println("2. Refrescar piezas y saltar turno.");
            System.out.println("3. Saltar turno.");
            switch (Recibir.recibirInt("Ingrese su elección.")) {
                case 1:
                    System.out.println("colocar una pieza");

                    salir=true;
                    break;
                case 2:
                    System.out.println("refrescar píezas");
                    jugador.setSaltos(jugador.getSaltos()+1);
                    salir=true;
                    break;
                case 3:
                    System.out.println("Saltar turno");
                    jugador.setSaltos(jugador.getSaltos()+1);
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una de las opciones sugeridas.");
                    break;
            }
        }
    }

    public boolean acabado(){
        boolean condicion;
        if(this.jugador1.getSaltos()>=2&&this.jugador2.getSaltos()>=2){
            condicion=true;
        }else{
            condicion=false;
        }
        return condicion;
    }
}
