package ClasesOrganizarLuego;

import java.util.Scanner;

public class Recibir {


    private static boolean valid = false;
    private static Scanner lectura=new Scanner (System.in);
    private static String revisar="";


    public static int recibirInt(String mensaje){
        while(!valid){
            System.out.println(mensaje);
            revisar=lectura.next();
            if(revisar.matches("[0-9]*")){
                return Integer.parseInt(revisar);
            }
            else{
                System.out.println("Ingreso un dato invalido, intente de nuevo.");
            }
        }
        return 0;
    }

    public static String recibirString(String mensaje){
        System.out.println(mensaje);
        return lectura.next();
    }

}
