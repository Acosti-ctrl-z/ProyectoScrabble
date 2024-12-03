package ClasesOrganizarLuego;

public class Usuario {
    private String alias;
    private String correo;
    private int puntajeAcumulado;
    private int partidasGanadas;
    private int palabrasJugadas;

    public Usuario() {
        this.alias = Recibir.recibirString("Ingrese el nombre del usuario.");
        this.correo = Recibir.recibirEmail("Ingrese el email del usuario.");
        this.palabrasJugadas = 0;
        this.puntajeAcumulado = 0;
        this.partidasGanadas = 0;
    }

    public Usuario(String alias, String correo, int puntajeAcumulado, int partidasGanadas, int palabrasJugadas) {
        this.alias = alias;
        this.correo = correo;
        this.puntajeAcumulado = puntajeAcumulado;
        this.partidasGanadas = partidasGanadas;
        this.palabrasJugadas = palabrasJugadas;
    }

    public void modificarDatos() {
        this.alias = Recibir.recibirString("Ingrese el nuevo nombre del usuario.");
        this.correo = Recibir.recibirEmail("Ingrese el nuevo email del usuario.");
    }

    public void mostrarDatos() {
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

    public void aumentarPartidasGanadas() {
        ++this.palabrasJugadas;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getCorreo() {
        return this.correo;
    }

    public int getPuntajeAcumulado() {
        return this.puntajeAcumulado;
    }

    public int getPalabrasJugadas() {
        return this.palabrasJugadas;
    }

    public int getPartidasGanadas() {
        return this.partidasGanadas;
    }
}
