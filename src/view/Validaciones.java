package view;
import java.util.*;

public class Validaciones {
    static Scanner scan;
    static {
        scan = new Scanner(System.in);
    }

    public Validaciones() {
    }

    public static int limite(int a, int b){
        int x;
        do {
            while (!scan.hasNextInt()) {
                Mostrar.mostrar("Incorrecto, ingresar nuevamente: ");
                scan.nextLine();
            }
            x = scan.nextInt();
        } while (x < a || x > b);
        return x;
    }

}
