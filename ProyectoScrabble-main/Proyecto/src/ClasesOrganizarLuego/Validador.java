package ClasesOrganizarLuego;

import java.util.List;

public class Validador {

    public Validador() {

    }

    public static boolean esPalabra(String palabra){
        String rut = "C:\\Users\\Jesus\\IdeaProjects\\Proyecto\\Lista_Rae_Scrabble.txt";
        List<String> palabras = ListaDePalabras.leerArchivo(rut);
        return ListaDePalabras.verificacion(palabras, palabra);
    }

    public static boolean estaVacio(Tablero posicion, int fila, int columna){
        return posicion.getTablero()[fila - 1][columna - 1].getLetra().equals(" ");
    }

}
