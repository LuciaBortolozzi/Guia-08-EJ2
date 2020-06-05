package controller;
import model.*;
import view.Mostrar;

import java.util.*;

public class Controlador {
    static Golosinas golosina1 = new Golosinas(1245, "Milka", new String[]{"dulce", "amargo"}, 156.1);
    static Golosinas golosina2 = new Golosinas(1246, "Sugus", new String[]{"dulce", "acido"}, 156.7);
    static Golosinas golosina3 = new Golosinas(1247, "Bazooka", new String[]{"dulce", "acido"}, 98.6);
    static Golosinas golosina4 = new Golosinas(1248, "Rocklets", new String[]{"dulce", "amargo"}, 98.9);
    static Golosinas[] golosinas = new Golosinas[4];



    public Controlador(){


    }

    public static void opcion0() {

        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
        int max = clase1.maximoValor();
        Mostrar.mostrar("Maximo: " + max);
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
        Mostrar.mostrar(golosina3.getDescripcion() + " ha sido borrada");

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
            Mostrar.mostrar("Hay repetidos");
        } else {
            Mostrar.mostrar("No hay repetidos");
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
        boolean igual = clase1.igualValores(enterosAux);

        if (igual) {
            Mostrar.mostrar("Hay valores en comun");
        } else {
            Mostrar.mostrar("No hay valores en comun");
        }
    }

    public static void opcion5() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
//        clase1.agregar();
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
//        clase1.distintosValores();
    }

    public static void opcion8() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
//        clase1.copiarLista();
    }


}