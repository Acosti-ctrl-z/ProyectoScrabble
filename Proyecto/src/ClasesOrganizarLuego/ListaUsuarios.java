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
                System.out.println("Alias: " + usuario.getAlias() + ".");
                System.out.println("Email: " + usuario.getCorreo() + ".");
                System.out.println("Palabras jugadas: " + usuario.getPalabrasJugadas() + ".");
                System.out.println("Palabras jugadas: " + usuario.getPuntajeAcumulado() + ".");
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
                }else{
                    System.out.println("Objetivo encontrado.");
                    listaUsuarios.set(objetivo-1, new Usuario());
                    System.out.println("Usuario modificado.");
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
                }
            }

        }
    }

    public void agregarUsuario(){
        if(listaUsuarios == null || listaUsuarios.isEmpty()){
            this.listaUsuarios.add(new Usuario());
        } else{
            this.listaUsuarios.add(new Usuario());
        }
    }
}
