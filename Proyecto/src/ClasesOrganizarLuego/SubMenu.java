package ClasesOrganizarLuego;

public class SubMenu implements Iniciable{

    private static boolean salir= false;
    public SubMenu(){}
    public void iniciar() {
        while (!salir) {
            System.out.println("Opciones: ");
            System.out.println("1. Agregar un usuario.");
            System.out.println("2. Leer la lista de jugadores con sus estadísticas.");
            System.out.println("3. Modificar datos de un jugador.");
            System.out.println("4. Eliminar un jugador.");
            System.out.println("5. Leer la lista de partidas.");
            System.out.println("6. Salir. ");
            switch (Recibir.recibirInt()) {
                case 1:
                    System.out.println("Agregar un usario");
                    break;
                case 2:
                    System.out.println("Printear jugadores");
                    break;
                case 3:
                    System.out.println("Modificar jugadores");
                    salir = true;
                    break;
                case 4:
                    System.out.println("Eliminar un jugador");
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
                    break;
            }
        }
    }

}
