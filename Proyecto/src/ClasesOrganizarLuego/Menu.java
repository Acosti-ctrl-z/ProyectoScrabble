package ClasesOrganizarLuego;

public class Menu implements Iniciable{

    private boolean salir= false;

    public Menu(){
    }

    public void iniciar() {

        while (!salir) {

            System.out.println("Opciones: ");
            System.out.println("1. Iniciar una partida. ");
            System.out.println("2. Manipular datos del juego (usuarios, estadísticas, partidas).");
            System.out.println("3. Salir. ");

            switch (Recibir.recibirInt("Ingrese su elección.")) {
                case 1:
                    System.out.println("Aquí se inicia la partida.");
                    break;
                case 2:
                    SubMenu subMenu=new SubMenu();
                    subMenu.iniciar();
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
