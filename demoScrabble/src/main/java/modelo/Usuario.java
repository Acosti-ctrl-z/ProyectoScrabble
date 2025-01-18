package modelo;



/**
 * Clase usuario y sus metodos
 */
public class Usuario {
    private String alias;
    private String correo;
    private int puntajeAcumulado;
    private int partidasGanadas;
    private int palabrasJugadas;

    /**
     * constructor de un usuario
     */
    public Usuario() {
        this.alias = "";
        this.correo = "";
        this.palabrasJugadas = 0;
        this.puntajeAcumulado = 0;
        this.partidasGanadas = 0;
    }

    /**
     * Construcor de un usuario cuando ya se tienen los datos
     * @param alias alias del usuario
     * @param correo correo del usuario
     * @param puntajeAcumulado puntaje acumulado del usuario
     * @param partidasGanadas partidas ganadas del usuario
     * @param palabrasJugadas partidas jugadas por el usuario
     */
    public Usuario(String alias, String correo, int puntajeAcumulado, int partidasGanadas, int palabrasJugadas) {
        this.alias = alias;
        this.correo = correo;
        this.puntajeAcumulado = puntajeAcumulado;
        this.partidasGanadas = partidasGanadas;
        this.palabrasJugadas = palabrasJugadas;
    }

    /**
     * metodo para modificar los datos de un usuario (decidimos que solo se podian modificar el alias y el correo)

    /**
     * metodo que muestra en consola los datos del usuario
     */
    public void mostrarDatos() {
        System.out.println("Alias: " + this.alias + ".");
        System.out.println("Email: " + this.correo + ".");
        System.out.println("Palabras jugadas: " + this.palabrasJugadas + ".");
        System.out.println("Palabras jugadas: " + this.puntajeAcumulado + ".");
    }

    /**
     * setter del alias del usuario
     * @param alias nuevo alias del usario
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * setter del correo del usario
     * @param correo nuevo correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Suma el puntaje acumulado en una partida al total del usuario
     * @param puntajeAcumulado puntaje acumulado por el jugador en la partida
     */
    public void aumentarPuntajeAcumulado(int puntajeAcumulado) {
        this.puntajeAcumulado += puntajeAcumulado;
    }

    /**
     * Suma las palabras jugadas en una partida
     * @param palabrasJugadas el numero de palabras que el jugador coloco en la partida
     */
    public void aumentarPalabrasJugadas(int palabrasJugadas) {
        this.palabrasJugadas += palabrasJugadas;
    }

    /**
     * Aumenta en 1 las partidas ganadas
     */
    public void aumentarPartidasGanadas() {
        ++this.palabrasJugadas;
    }

    /**
     * getter del alias del usuario
     * @return valor del atributo alias del ususario
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * getter del correo del usuario
     * @return valor del atributo correo del usuario
     */
    public String getCorreo() {
        return this.correo;
    }

    /**
     * getter del total del puntaje acumulado por el usuario
     * @return valor del atributo palabrasJugadas
     */
    public int getPuntajeAcumulado() {
        return this.puntajeAcumulado;
    }

    /**
     * getter del total de las palabras jugadas por el usuario
     * @return valor del atributo palabrasJugadas
     */
    public int getPalabrasJugadas() {
        return this.palabrasJugadas;
    }

    /**
     * getter del total de partidas ganadas por el usuario
     * @return valor del atributo partidasGanadas
     */
    public int getPartidasGanadas() {
        return this.partidasGanadas;
    }
}
