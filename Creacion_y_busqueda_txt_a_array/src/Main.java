import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        String rut = "C:\\Users\\Dell\\Downloads\\Lista_Rae_Scrabble.txt";
        List<String> lol = TxtArray.leerArchivo(rut);
        System.out.println(lol);
        String a = "poder";
        boolean b = TxtArray.verificacion(lol,a);
        System.out.println(b);
    }
}