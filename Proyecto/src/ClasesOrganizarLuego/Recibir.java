package ClasesOrganizarLuego;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recibir {


    private static boolean valid = false;
    private static Scanner lectura=new Scanner (System.in);
    private static String revisar="";


    public static int recibirInt(String mensaje){
        while(!valid){
            System.out.print(mensaje+" ");
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
        System.out.print(mensaje+" ");
        return lectura.next();
    }

    public static String recibirEmail(String mensaje){
        boolean aprobado=false;
        String email="";
        while (!aprobado) {
            Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
            email=recibirString("Escribe tu email.");
            Matcher matcher = pattern.matcher(email);
            aprobado=matcher.matches();
            if(!aprobado){
                System.out.println("Lo ingresado no estuvo en formato email.");
            }
        }

        return email;
    }

}
