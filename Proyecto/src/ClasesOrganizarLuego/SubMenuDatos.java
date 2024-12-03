package ClasesOrganizarLuego;

public class SubMenuDatos implements Iniciable {
    private static boolean salir = false;
    private ListaUsuarios users;

    public SubMenuDatos(ListaUsuarios users) {
        this.users = users;
    }

    public void iniciar() {
        salir = false;

        while(!salir) {
            System.out.println("Opciones: ");
            System.out.println("1. Agregar un usuario.");
            System.out.println("2. Leer la lista de jugadores con sus estadísticas.");
            System.out.println("3. Modificar datos de un jugador.");
            System.out.println("4. Eliminar un jugador.");
            System.out.println("5. Leer la lista de partidas.");
            System.out.println("6. Retroceder. ");
            switch(Recibir.recibirInt("Ingrese su elección.")) {
                case 1:
                    System.out.println("Agregar un usario");
                    this.users.agregarUsuarioNuevo();
                    EscritorJson.guardarDatos(this.users, "ListaUsuarios");
                    break;
                case 2:
                    System.out.println("Printear jugadores");
                    this.users.leerLista();
                    break;
                case 3:
                    System.out.println("Modificar jugadores");
                    this.users.modificarUsuario();
                    break;
                case 4:
                    System.out.println("Eliminar un jugador");
                    this.users.eliminarUsuario();
                    break;
                case 5:
                    System.out.println("Printear partidas");
                    break;
                case 6:
                    System.out.println("Cerrando submenú.");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una de las opciones sugeridas.");
            }
        }

    }
}
