package ClasesOrganizarLuego;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LectorJson {
    public LectorJson() {
    }

    public static ListaUsuarios leerDatos(ListaUsuarios listaUsuarios, String nombreArcihvo) {
        JSONParser lectorDeDatos = new JSONParser();

        try {
            FileReader lectorDeArchivos = new FileReader(nombreArcihvo);

            ListaUsuarios var17;
            try {
                JSONArray listaObjetos = (JSONArray)lectorDeDatos.parse(lectorDeArchivos);
                Iterator var5 = listaObjetos.iterator();

                while(true) {
                    if (!var5.hasNext()) {
                        var17 = listaUsuarios;
                        break;
                    }

                    Object auxObjeto = var5.next();
                    JSONObject auxUsuario = (JSONObject)auxObjeto;
                    String correo = (String)auxUsuario.get("correo");
                    int palabrasJugadas = Integer.parseInt(auxUsuario.get("palabrasJugadas").toString());
                    String alias = (String)auxUsuario.get("alias");
                    int puntajeAcumulado = Integer.parseInt(auxUsuario.get("puntajeAcumulado").toString());
                    int partidasGanadas = Integer.parseInt(auxUsuario.get("partidasGanadas").toString());
                    Usuario usuario = new Usuario(alias, correo, puntajeAcumulado, partidasGanadas, palabrasJugadas);
                    listaUsuarios.agregarUsuario(usuario);
                }
            } catch (Throwable var15) {
                try {
                    lectorDeArchivos.close();
                } catch (Throwable var14) {
                    var15.addSuppressed(var14);
                }

                throw var15;
            }

            lectorDeArchivos.close();
            return var17;
        } catch (ParseException | IOException var16) {
            System.out.println("Archivo no encontrado!");
            return new ListaUsuarios();
        }
    }
}

