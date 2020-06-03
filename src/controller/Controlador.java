package controller;
import model.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Controlador {



    public Controlador(){
        Golosinas golosina1 = new Golosinas(1245, "Milka", new String[]{"dulce", "amargo"}, 156.1);
        Golosinas golosina2 = new Golosinas(1246, "Sugus", new String[]{"dulce", "acido"}, 123.7);
        Vector<Golosinas> golosinas = new Vector<Golosinas>();
        golosinas.add(golosina1);
        golosinas.add(golosina2);

        Clase1 clase1 = new Clase1(10, golosinas);

    }

    public static void opcion0() {
    }

    public static void opcion1() {
    }

    public static void opcion2() {
    }

    public static void opcion3() {
    }

    public static void opcion4() {
    }

    public static void opcion5() {
    }

    public static void opcion6() {
    }

    public static void opcion7() {
    }

    public static void opcion8() {
    }

    public static void opcion9() {
    }

    public void maximoValor(){

        Golosinas golosina1 = new Golosinas(1245, "Milka", new String[]{"dulce", "amargo"}, 156.1);
        Golosinas golosina2 = new Golosinas(1246, "Sugus", new String[]{"dulce", "acido"}, 156.7);
        Vector<Golosinas> golosinas = new Vector<Golosinas>();
        golosinas.add(golosina1);
        golosinas.add(golosina2);

        Clase1 clase1 = new Clase1(10, golosinas);

        int max = Collections.max(clase1.getEnteros());
    }

    public void quitarObjeto (Golosinas golosina) throws Excepciones {

        Golosinas golosina1 = new Golosinas(1245, "Milka", new String[]{"dulce", "amargo"}, 156.1);
        Golosinas golosina2 = new Golosinas(1246, "Sugus", new String[]{"dulce", "acido"}, 156.7);
        Vector<Golosinas> golosinas = new Vector<Golosinas>();
        golosinas.add(golosina1);
        golosinas.add(golosina2);

        Clase1 clase1 = new Clase1(10, golosinas);

        if (clase1.getGolosinas().contains(golosina)){
            clase1.getGolosinas().remove(golosina);
        } else {
            throw new Excepciones("no existe el objeto");
        }
    }

    public void ordenDescendente(){
        /*devuelve  la  colección  de  objetos  de  la  clase  Golosinas ordenada en forma descendente, según el precio.*/
        Golosinas golosina1 = new Golosinas(1245, "Milka", new String[]{"dulce", "amargo"}, 156.1);
        Golosinas golosina2 = new Golosinas(1246, "Sugus", new String[]{"dulce", "acido"}, 156.7);
        Vector<Golosinas> golosinas = new Vector<Golosinas>();
        golosinas.add(golosina1);
        golosinas.add(golosina2);

        Clase1 clase1 = new Clase1(10, golosinas);

        Collections.sort(clase1.getGolosinas());

    }

    public void hayRepetidos(){
        /*indica  si  existen  valores  repetidos  en  la  colección  de  objetos Golosinas, según un criterio diferente al punto c*/
    }
}