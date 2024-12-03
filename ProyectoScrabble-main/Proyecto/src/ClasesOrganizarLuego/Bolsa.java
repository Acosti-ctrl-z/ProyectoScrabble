package ClasesOrganizarLuego;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bolsa {
    private List<Ficha> disponibles;

    public List<Ficha> getDisponibles() {
        return disponibles;
    }

    public Bolsa(){
        this.disponibles= new ArrayList<>();

        for(int i=1; i<=12; i+=1){
            disponibles.add(new Ficha("A",1));
        }
        for(int i=1; i<=2; i+=1){
            disponibles.add(new Ficha("B",4));
        }
        for(int i=1; i<=4; i+=1){
            disponibles.add(new Ficha("C",3));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("CH",8));
        }
        for(int i=1; i<=5; i+=1){
            disponibles.add(new Ficha("D",3));
        }
        for(int i=1; i<=12; i+=1){
            disponibles.add(new Ficha("E",1));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("F",5));
        }
        for(int i=1; i<=2; i+=1){
            disponibles.add(new Ficha("G",3));
        }
        for(int i=1; i<=2; i+=1){
            disponibles.add(new Ficha("H",5));
        }
        for(int i=1; i<=6; i+=1){
            disponibles.add(new Ficha("I",1));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("J",10));
        }
        for(int i=1; i<=4; i+=1){
            disponibles.add(new Ficha("L",2));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("LL",8));
        }
        for(int i=1; i<=2; i+=1){
            disponibles.add(new Ficha("M",3));
        }
        for(int i=1; i<=5; i+=1){
            disponibles.add(new Ficha("N",2));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("Ñ",10));
        }
        for(int i=1; i<=9; i+=1){
            disponibles.add(new Ficha("O",1));
        }
        for(int i=1; i<=2; i+=1){
            disponibles.add(new Ficha("P",4));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("Q",8));
        }
        for(int i=1; i<=5; i+=1){
            disponibles.add(new Ficha("R",2));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("RR",8));
        }
        for(int i=1; i<=6; i+=1){
            disponibles.add(new Ficha("S",1));
        }
        for(int i=1; i<=4; i+=1){
            disponibles.add(new Ficha("T",2));
        }
        for(int i=1; i<=5; i+=1){
            disponibles.add(new Ficha("U",5));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("V",4));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("X",10));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("Y",5));
        }
        for(int i=1; i<=1; i+=1){
            disponibles.add(new Ficha("Z",10));
        }
        for(int i=1; i<=2; i+=1){
            disponibles.add(new Ficha("&",0));
        }
    }

    public void repartirFichas(Jugador jugador){
        while((jugador.getFichas().size()<7)&&(disponibles.size()>1)){
            int i=(int) (Math.random() * disponibles.size());
            jugador.agregarFicha(disponibles.get(i));
            disponibles.remove(i);
        }
    }

    public void refrescarPiezas(Jugador jugador){
        jugador.getFichas().clear();
        repartirFichas(jugador);
    }
}
