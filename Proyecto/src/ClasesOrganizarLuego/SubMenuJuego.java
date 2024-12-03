package ClasesOrganizarLuego;

import java.util.Iterator;

public class SubMenuJuego implements Iniciable {
    private static boolean salir = false;
    private ListaUsuarios users;
    private Jugador jugador1;
    private Jugador jugador2;

    public SubMenuJuego(ListaUsuarios users) {
        this.users = users;
    }

    public Jugador seleccionarJugador() {
        boolean encontrado = false;
        Jugador retornar = null;

        while(!encontrado) {
            String nombre = Recibir.recibirString("Ingrese su nombre de usuario");
            Iterator var4 = this.users.getListaUsuarios().iterator();

            while(var4.hasNext()) {
                Usuario usuario = (Usuario)var4.next();
                if (usuario.getAlias().equals(nombre)) {
                    retornar = new Jugador(usuario);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("El usuario no fue encontrado, intente de nuevo.");
            }
        }

        return retornar;
    }

    public void iniciar() {
        salir = false;
        System.out.println("Ingrese el nombre del jugador 1.");
        this.jugador1 = this.seleccionarJugador();
        System.out.println("Ingrese el nombre del jugador 2.");
        this.jugador2 = this.seleccionarJugador();

        while(!salir) {
            System.out.println("Opciones: ");
            System.out.println("1. Jugar una nueva partida.");
            System.out.println("2. Continuar partida anterior.");
            System.out.println("3. Ver estadísticas de los jugadores.");
            System.out.println("4. Retroceder. ");
            switch(Recibir.recibirInt("Ingrese su elección.")) {
                case 1:
                    System.out.println("Nueva partida");
                    Partida partida = new Partida(this.jugador1, this.jugador2);
                    partida.iniciar();
                    break;
                case 2:
                    System.out.println("Continuar partida");
                    break;
                case 3:
                    System.out.println("Mostrar información de jugadores");
                    System.out.print("1. ");
                    this.jugador1.mostrarDatos();
                    System.out.print("2. ");
                    this.jugador2.mostrarDatos();
                    break;
                case 4:
                    System.out.println("Cerrando submenú.");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una de las opciones sugeridas.");
            }
        }

    }
}

