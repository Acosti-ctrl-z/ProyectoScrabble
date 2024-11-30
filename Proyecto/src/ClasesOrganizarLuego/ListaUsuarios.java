package ClasesOrganizarLuego;

import java.util.List;

public class ListaUsuarios {
    private List<Usuario> listaUsuarios;

    public ListaUsuarios() {
        this.listaUsuarios=null;
    }

    public void leerLista() {
        if (listaUsuarios == null || listaUsuarios.isEmpty()) {
            System.out.println("No hay ningún usuario registrado");
        } else {
            int posicion = 1;
            for (Usuario usuario : this.listaUsuarios) {
                System.out.print(posicion + ". ");
                System.out.println("Alias: " + usuario.getAlias() + ".");
                System.out.println("Email: " + usuario.getCorreo() + ".");
                System.out.println("Palabras jugadas: " + usuario.getPalabrasJugadas() + ".");
                System.out.println("Palabras jugadas: " + usuario.getPuntajeAcumulado() + ".");
                posicion = posicion + 1;
            }
        }
    }

    public void agregarUsuario(Usuario usuarioNuevo){
        this.listaUsuarios.add(usuarioNuevo);
    }
}
