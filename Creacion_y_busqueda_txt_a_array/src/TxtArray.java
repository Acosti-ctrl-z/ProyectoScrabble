import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TxtArray {
    private static List<String> lista = new ArrayList<>();
    public static List<String> leerArchivo(String ruta){
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null)
            {
                lista.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }

    public static boolean verificacion(List<String> lista, String ruta){
        for (String s : lista) {
            if (Objects.equals(s, ruta)) {
                return true;
            }
        }
        return false;
    }
}
