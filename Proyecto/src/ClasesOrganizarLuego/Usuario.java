package ClasesOrganizarLuego;

public class Usuario {

    private String alias;
    private String correo;
    private int puntajeAcumulado;
    private int palabrasJugadas;

    public Usuario(String alias, String correo){
        this.alias=alias;
        this.correo=correo;
        this.palabrasJugadas=0;
        this.puntajeAcumulado=0;
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
}
