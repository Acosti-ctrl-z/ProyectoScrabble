package modelo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class LeerJSONDesdeOtraCarpeta {

    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\User\\Downloads\\ListaUsuarios"; // Reemplaza con la ruta completa

        try {
            // Crear un objeto JSONParser para analizar el archivo
            JSONParser parser = new JSONParser();

            // Leer el archivo JSON
            Object obj = parser.parse(new FileReader(rutaArchivo));

            // Convertir el objeto a un JSONArray (si el archivo contiene un array)
            JSONArray jsonArray = (JSONArray) obj;

            // Iterar sobre los objetos JSON dentro del array
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                String nombre = (String) jsonObject.get("nombre");
                int edad = (Integer) jsonObject.get("edad");
                // ... y así para otros campos

                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}