package ClasesOrganizarLuego;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recibir {
    private static boolean valid = false;
    private static Scanner lectura;
    private static String revisar;

    public Recibir() {
    }

    public static int recibirInt(String mensaje) {
        while(!valid) {
            System.out.print(mensaje + " ");
            revisar = lectura.next();
            if (revisar.matches("[0-9]*")) {
                return Integer.parseInt(revisar);
            }

            System.out.println("Ingreso un dato invalido, intente de nuevo.");
        }

        return 0;
    }

    public static String recibirString(String mensaje) {
        System.out.print(mensaje + " ");
        return lectura.next();
    }

    public static String recibirEmail(String mensaje) {
        boolean aprobado = false;
        String email = "";

        while(!aprobado) {
            Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
            email = recibirString(mensaje);
            Matcher matcher = pattern.matcher(email);
            aprobado = matcher.matches();
            if (!aprobado) {
                System.out.println("Lo ingresado no estuvo en formato email.");
            }
        }

        return email;
    }

    public static int recibirDimension(String mensaje) {
        boolean aprobado = false;
        int dimension = 0;

        while(!aprobado) {
            dimension = recibirInt(mensaje);
            if(dimension>0&&dimension<16){
                aprobado=true;
            }else{
                System.out.println("Lo ingresado debe estar entre 1 y 15.");
            }
        }

        return dimension;
    }
    static {
        lectura = new Scanner(System.in);
        revisar = "";
    }
}
