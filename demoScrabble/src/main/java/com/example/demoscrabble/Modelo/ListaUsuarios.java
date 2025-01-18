package com.example.demoscrabble.Modelo;



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

    /**El metodo leerLista() lee la listaUsuarios
     */
    public void leerLista() {
        if (this.listaUsuarios != null && !this.listaUsuarios.isEmpty()) {
            int posicion = 1;

            for(Iterator var2 = this.listaUsuarios.iterator(); var2.hasNext(); ++posicion) {
                Usuario usuario = (Usuario)var2.next();
                System.out.print(posicion + ". ");
                usuario.mostrarDatos();
            }
        } else {
            System.out.println("No hay ningún usuario registrado");
        }

    }

    /**
     * metodo para agregar un usuario nuevo a la lista
     */
    public void agregarUsuarioNuevo() {
        this.listaUsuarios.add(new Usuario());
    }

    /**
     * metodo para agregar un usuario ya creado a la lista
     * @param usuario el usuario a agregr
     */
    public void agregarUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }
}