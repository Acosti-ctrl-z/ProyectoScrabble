package ClasesOrganizarLuego;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorJson {
    //Guarda los datos de los Usuarios en un JSON
    public static void guardarDatos(ListaUsuarios usuarios, String nombreArchivo){
        JSONArray jsonArray = new JSONArray();
        for(Usuario usuario : usuarios.getListaUsuarios()) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("alias", usuario.getAlias());
            jsonObject.put("correo", usuario.getCorreo());
            jsonObject.put("puntajeAcumulado", usuario.getPuntajeAcumulado());
            jsonObject.put("palabrasJugadas", usuario.getPalabrasJugadas());
            jsonObject.put("partidasGanadas", usuario.getPartidasGanadas());
            jsonArray.add(jsonObject);
        }

        //Escribe lo datos en el JSON
        try (FileWriter file = new FileWriter(nombreArchivo)) {
            file.write(jsonArray.toJSONString());
            System.out.println("Archivos gruardados con exito!");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error para guardar los datos!");
        }
    }

}
