package modelo;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Lista de los usuarios registrados y sus metodos
 */
public class ListaUsuarios {
    private List<Usuario> listaUsuarios = new ArrayList();

    /**
     * getter de la lista de usuarios
     * @return el valor del atributo listaUsuarios (la lista de los usuarios)
     */
    public List<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }

    /**
     * setter del atributo listaUsuarios en la clase
     * @param listaUsuarios la lista que se reemplazara con la actual
     */
    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    /**
     * constructor vacio de la clase ListaUsuarios
     */
    public ListaUsuarios() {
    }

    public void agregarUsuario(Usuario usuario) {
    }
}