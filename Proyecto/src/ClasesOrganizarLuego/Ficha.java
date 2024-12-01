package ClasesOrganizarLuego;

public class Ficha {
    private char letra;
    private int cantidad;
    private int puntaje;

    public Ficha(char letra) {
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
