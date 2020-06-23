package controller;
import model.*;

import java.io.FileNotFoundException;
import java.util.*;

public class Controlador {
    static Golosinas golosina1 = new Golosinas(1245, "Milka", new String[]{"dulce", "amargo"}, 156.1);
    static Golosinas golosina2 = new Golosinas(1246, "Sugus", new String[]{"dulce", "acido"}, 156.7);
    static Golosinas golosina3 = new Golosinas(1247, "Bazooka", new String[]{"dulce", "acido"}, 98.6);
    static Golosinas golosina4 = new Golosinas(1248, "Rocklets", new String[]{"dulce", "amargo"}, 98.9);
    static Golosinas[] golosinas = new Golosinas[4];
    static String concatenado = " ";


    public Controlador(){


    }

    public static void opcion0() {

        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
        int max = clase1.maximoValor();

        colectar("Maximo: " + max);


    }

    public static void opcion1() {

        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);

        try {
            clase1.quitarObjeto(golosina3);
        } catch (Excepciones excepciones) {
            excepciones.printStackTrace();
        }

        colectar(golosina3.getDescripcion() + " ha sido borrada");

    }

    public static void opcion2() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);

        clase1.ordenDescendente();
    }

    public static void opcion3() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina2;
        Clase1 clase1 = new Clase1(10, golosinas);
        boolean repetidos = clase1.hayRepetidos();

        if (repetidos) {
            colectar("Hay repetidos");

        } else {
            colectar("No hay repetidos");

        }
    }

    public static void opcion4() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);

        Random rand = new Random();
        ArrayList<Integer> enterosAux = new ArrayList<Integer>();
        enterosAux.add(rand.nextInt(8999) + 1000);
        enterosAux.add(rand.nextInt(8999) + 1000);
        boolean distinto = clase1.igualValores(enterosAux);

        if (!distinto) {
            colectar("Hay valores en comun");
        } else {
            colectar("No hay valores en comun");
        }
    }

    public static void opcion5() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);

        Golosinas golosina5 = new Golosinas(1249, "Lays", new String[]{"salado", "jamon"}, 186.1);
        Golosinas golosina6 = new Golosinas(1250, "Pringles", new String[]{"salado", "cebolla"}, 176.7);
        ArrayList<Golosinas> golosinas = new ArrayList<Golosinas>();
        golosinas.add(golosina5);
        golosinas.add(golosina6);

        clase1.agregar(golosinas);
    }

    public static void opcion6() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
        Random rand = new Random();
        int entero = rand.nextInt(8999) + 1000;
        clase1.busquedaMultiple(entero);
    }

    public static void opcion7() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
        List<Golosinas> golosinasAux = new ArrayList<Golosinas>();
        Golosinas golosina5 = new Golosinas(1249, "Lays", new String[]{"salado", "jamon"}, 186.1);
        Golosinas golosina6 = new Golosinas(1250, "Pringles", new String[]{"salado", "cebolla"}, 176.7);
        golosinasAux.add(golosina5);
        golosinasAux.add(golosina6);

        clase1.distintosValores(golosinasAux);
    }

    public static void opcion8() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);

        int pos1 = 0;
        int pos2 = 2;
        clase1.copiarLista(pos1, pos2);
    }

    public static String colectar(String texto){

        concatenado += texto + " | ";
        
        return concatenado;
    }

    public static void opcionGrabar() {
        try {
            Grabar.grabar(concatenado);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}