package ClasesOrganizarLuego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class ManejoArchivos {
    private static List<String> lista = new ArrayList<>();

    public ManejoArchivos() {
    }

    public static List<String> leerArchivo(String ruta) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            String linea;
            try {
                while((linea = br.readLine()) != null) {
                    lista.add(linea);
                }
            } catch (Throwable var5) {
                try {
                    br.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            br.close();
        } catch (IOException var6) {
            System.err.println("Error al leer el archivo: " + var6.getMessage());
        }

        return lista;
    }

    public static boolean verificacion(List<String> lista, String ruta) {
        Iterator var2 = lista.iterator();

        String s;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            s = (String)var2.next();
        } while(!Objects.equals(s, ruta));

        return true;
    }
}
