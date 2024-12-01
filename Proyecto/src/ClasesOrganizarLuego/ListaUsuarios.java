package ClasesOrganizarLuego;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    private List<Usuario> listaUsuarios;

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ListaUsuarios() {
        this.listaUsuarios= new ArrayList<>();
    }

    public void leerLista() {
        if (listaUsuarios == null || listaUsuarios.isEmpty()) {
            System.out.println("No hay ningún usuario registrado");
        } else {
            int posicion = 1;
            for (Usuario usuario : this.listaUsuarios) {
                System.out.print(posicion + ". ");
                usuario.mostrarDatos();
                posicion = posicion + 1;
            }
        }
    }

    public void modificarUsuario(){
        if (listaUsuarios == null || listaUsuarios.isEmpty()) {
            System.out.println("No hay ningún usuario registrado");
        } else {
            this.leerLista();
            while(true){
                int objetivo=Recibir.recibirInt("Escriba el índice del ususario a modificar");
                if(objetivo<1||objetivo>listaUsuarios.size()){
                    System.out.println("Objetivo no encontrado, vuelva a intentar.");
                    break;
                }else{
                    System.out.println("Objetivo encontrado.");
                    Usuario aModificar=listaUsuarios.get(objetivo-1);
                    aModificar.modificarDatos();
                    listaUsuarios.set(objetivo-1, aModificar);
                    System.out.println("Usuario modificado.");
                    break;
                }
            }

        }
    }

    public void eliminarUsuario(){
        if (listaUsuarios == null || listaUsuarios.isEmpty()) {
            System.out.println("No hay ningún usuario registrado");
        } else {
            this.leerLista();
            while(true){
                int objetivo=Recibir.recibirInt("Escriba el índice del ususario a borar");
                if(objetivo<1||objetivo>listaUsuarios.size()){
                    System.out.println("Objetivo inválido, vuelva a intentar.");
                }else{
                    System.out.println("Objetivo encontrado.");
                    listaUsuarios.remove(objetivo-1);
                    System.out.println("Usuario eliminado.");
                    break;
                }
            }

        }
    }

    public void agregarUsuarioNuevo(){
            this.listaUsuarios.add(new Usuario());
    }

    public void agregarUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }
}
