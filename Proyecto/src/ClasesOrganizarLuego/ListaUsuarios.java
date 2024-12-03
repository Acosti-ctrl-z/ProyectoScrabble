package ClasesOrganizarLuego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaUsuarios {
    private List<Usuario> listaUsuarios = new ArrayList();

    public List<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ListaUsuarios() {
    }

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

    public void modificarUsuario() {
        if (this.listaUsuarios != null && !this.listaUsuarios.isEmpty()) {
            this.leerLista();
            int objetivo = Recibir.recibirInt("Escriba el índice del ususario a modificar");
            if (objetivo >= 1 && objetivo <= this.listaUsuarios.size()) {
                System.out.println("Objetivo encontrado.");
                Usuario aModificar = (Usuario)this.listaUsuarios.get(objetivo - 1);
                aModificar.modificarDatos();
                this.listaUsuarios.set(objetivo - 1, aModificar);
                System.out.println("Usuario modificado.");
            } else {
                System.out.println("Objetivo no encontrado, vuelva a intentar.");
            }
        } else {
            System.out.println("No hay ningún usuario registrado");
        }

    }

    public void eliminarUsuario() {
        if (this.listaUsuarios != null && !this.listaUsuarios.isEmpty()) {
            this.leerLista();

            while(true) {
                int objetivo = Recibir.recibirInt("Escriba el índice del ususario a borar");
                if (objetivo >= 1 && objetivo <= this.listaUsuarios.size()) {
                    System.out.println("Objetivo encontrado.");
                    this.listaUsuarios.remove(objetivo - 1);
                    System.out.println("Usuario eliminado.");
                    break;
                }

                System.out.println("Objetivo inválido, vuelva a intentar.");
            }
        } else {
            System.out.println("No hay ningún usuario registrado");
        }

    }

    public void agregarUsuarioNuevo() {
        this.listaUsuarios.add(new Usuario());
    }

    public void agregarUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }
}