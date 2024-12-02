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

}
