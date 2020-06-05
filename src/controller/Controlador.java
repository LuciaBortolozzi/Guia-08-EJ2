package controller;
import model.*;
import view.Mostrar;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

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
            Mostrar.mostrar(golosina3.getDescripcion() + " ha sido borrada");
        } catch (Excepciones excepciones) {
            excepciones.printStackTrace();
        }
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
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
        clase1.hayRepetidos();
    }

    public static void opcion4() {
        golosinas[0] = golosina1;
        golosinas[1] = golosina2;
        golosinas[2] = golosina3;
        golosinas[3] = golosina4;
        Clase1 clase1 = new Clase1(10, golosinas);
//        clase1.igualValores();
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
//        clase1.busquedaMultiple();
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