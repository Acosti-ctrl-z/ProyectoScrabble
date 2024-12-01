package ClasesOrganizarLuego;

public class Usuario {

    private String alias;
    private String correo;
    private int puntajeAcumulado;
    private int partidasGanadas;
    private int palabrasJugadas;

    public Usuario(){
        this.alias= Recibir.recibirString("Ingrese el nombre del usuario.");
        this.correo= Recibir.recibirString("Ingrese el email del usuario.");
        this.palabrasJugadas=0;
        this.puntajeAcumulado=0;
        this.partidasGanadas=0;
    }

    public void modificarDatos(){
        this.alias= Recibir.recibirString("Ingrese el nombre del usuario.");
        this.correo= Recibir.recibirString("Ingrese el email del usuario.");
    }

    public void mostrarDatos(){
        System.out.println("Alias: " + this.alias + ".");
        System.out.println("Email: " + this.correo + ".");
        System.out.println("Palabras jugadas: " + this.palabrasJugadas + ".");
        System.out.println("Palabras jugadas: " + this.puntajeAcumulado + ".");
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void aumentarPuntajeAcumulado(int puntajeAcumulado) {
        this.puntajeAcumulado += puntajeAcumulado;
    }

    public void aumentarPalabrasJugadas(int palabrasJugadas) {
        this.palabrasJugadas += palabrasJugadas;
    }

    public String getAlias() {
        return alias;
    }

    public String getCorreo() {
        return correo;
    }

    public int getPuntajeAcumulado() {
        return puntajeAcumulado;
    }

    public int getPalabrasJugadas() {
        return palabrasJugadas;
    }

    public void setPuntajeAcumulado(int puntajeAcumulado) {
        this.puntajeAcumulado = puntajeAcumulado;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setPalabrasJugadas(int palabrasJugadas) {
        this.palabrasJugadas = palabrasJugadas;
    }
}
