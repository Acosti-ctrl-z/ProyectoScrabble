package ClasesOrganizarLuego;

public class Menu implements Iniciable{

    private ListaUsuarios users= new ListaUsuarios();
    private boolean salir= false;

    public Menu(){
        this.users=LectorJson.leerDatos(this.users,"ListaUsuarios");
    }

    public void iniciar() {
        salir=false;
        while (!salir) {

            System.out.println("Opciones: ");
            System.out.println("1. Iniciar una partida. ");
            System.out.println("2. Manipular datos del juego (usuarios, estadísticas, partidas).");
            System.out.println("3. Salir. ");

            switch (Recibir.recibirInt("Ingrese su elección.")) {
                case 1:
                    System.out.println("Aquí se inicia la partida.");
                    if (users.getListaUsuarios().isEmpty()||users.getListaUsuarios().size()<2){
                        System.out.println("Se necesitan al menos 2 jugadores registrados para jugar. Regístrelos en el menú principal");
                    }else{
                        SubMenuJuego subMenuJuego =new SubMenuJuego(users);
                        subMenuJuego.iniciar();
                    }
                    break;
                case 2:
                    SubMenuDatos subMenuDatos =new SubMenuDatos(users);
                    subMenuDatos.iniciar();
                    break;
                case 3:
                    System.out.println("Adiós");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una de las opciones sugeridas.");
                    break;
            }
        }
    }

}
