package ClasesOrganizarLuego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ManejoArchivos {
    private static List<String> lista = new ArrayList();

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
            } catch (Throwable var6) {
                try {
                    br.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            br.close();
        } catch (IOException var7) {
            System.err.println("Error al leer el archivo: " + var7.getMessage());
        }

        return lista;
    }

    public static boolean verificacion(List<String> lista, String ruta) {
        Iterator var2 = lista.iterator();

        while(var2.hasNext()) {
            String s = (String)var2.next();
            if (Objects.equals(s, ruta)) {
                return true;
            }
        }

        return false;
    }
}
