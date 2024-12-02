package ClasesOrganizarLuego;

import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;

public class LectorJson {
    //Se encarga de leer el JSON
    public static ListaUsuarios leerDatos(ListaUsuarios listaUsuarios,String nombreArcihvo){
        JSONParser lectorDeDatos = new JSONParser();
        //Intent abrir el archivo
        try (FileReader lectorDeArchivos = new FileReader(nombreArcihvo)){
            //Pasa los Usuarios que esten en el JSON a un array para poder trnasformarlos a un tipo de dato Usuario
            JSONArray listaObjetos = (JSONArray) lectorDeDatos.parse(lectorDeArchivos);

            for (Object auxObjeto : listaObjetos){
                JSONObject auxUsuario = (JSONObject) auxObjeto;


                String correo = (String) auxUsuario.get("correo");
                int palabrasJugadas = Integer.parseInt(auxUsuario.get("palabrasJugadas").toString());
                String alias = (String) auxUsuario.get("alias");
                int puntajeAcumulado = Integer.parseInt(auxUsuario.get("puntajeAcumulado").toString());
                int partidasGanadas=Integer.parseInt(auxUsuario.get("partidasGanadas").toString());
                Usuario usuario = new Usuario(alias, correo, puntajeAcumulado, partidasGanadas, palabrasJugadas);

                listaUsuarios.agregarUsuario(usuario);
            }
            return listaUsuarios;

        } catch (IOException | ParseException e) {
            System.out.println("Archivo no encontrado!");
        }
        return new ListaUsuarios();
    }
}