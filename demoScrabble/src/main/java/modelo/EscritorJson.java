package modelo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/**
 * Clase para crear el archivo json con los usuarios
 */
public class EscritorJson {
    /**
     * constructor de la clase
     */
    public EscritorJson() {
    }

    /**Crea el archivo que contiene la lista de usuarios
     * @param usuarios Lista de usuarios
     * @param nombreArchivo Nombre del archivo donde se guardan los jugadores
     *
     * El metodo guardarDatos Crea el archivo de lista de jugadores
     */
    public static void guardarDatos(ListaUsuarios usuarios, String nombreArchivo) {
        JSONArray jsonArray = new JSONArray();
        Iterator var3 = usuarios.getListaUsuarios().iterator();

        while(var3.hasNext()) {
            Usuario usuario = (Usuario)var3.next();
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("alias", usuario.getAlias());
            jsonObject.put("correo", usuario.getCorreo());
            jsonObject.put("puntajeAcumulado", usuario.getPuntajeAcumulado());
            jsonObject.put("palabrasJugadas", usuario.getPalabrasJugadas());
            jsonObject.put("partidasGanadas", usuario.getPartidasGanadas());
            jsonArray.add(jsonObject);
        }

        try {
            FileWriter file = new FileWriter(nombreArchivo);

            try {
                file.write(jsonArray.toJSONString());
                System.out.println("Archivos gruardados con exito!");
            } catch (Throwable var7) {
                try {
                    file.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }

                throw var7;
            }

            file.close();
        } catch (IOException var8) {
            System.out.println("Ha ocurrido un error para guardar los datos!");
        }

    }
}
