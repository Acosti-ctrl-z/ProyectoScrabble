package ClasesOrganizarLuego;

public class Ficha {
    private String letra;
    private int puntaje;

    public Ficha(String letra, int puntaje) {
        this.letra = letra;
        this.puntaje = puntaje;
    }

    public String getLetra() {
        return this.letra;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
