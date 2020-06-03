package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class Clase1 {

    ArrayList<Golosinas> golosinas = new ArrayList<Golosinas>();
    ArrayList<Integer> enteros = new ArrayList<Integer>();

    /*Como segundo parámetro, un vector con varios objetos de
    la clase Golosinas y los asigna al ArrayList correspondiente.*/

    public Clase1(int capacidad, Vector<Golosinas> golosinas){
        this.enteros = new ArrayList<Integer>(capacidad);

        Random rand = new Random();

        this.enteros.add(rand.nextInt(4));

        this.golosinas.addAll(golosinas);

    }

    public Clase1() {
    }

    public Clase1(ArrayList<Golosinas> golosinas, ArrayList<Integer> enteros) {
        this.golosinas = golosinas;
        this.enteros = enteros;
    }

    public ArrayList<Golosinas> getGolosinas() {
        return golosinas;
    }

    public void setGolosinas(ArrayList<Golosinas> golosinas) {
        this.golosinas = golosinas;
    }

    public ArrayList<Integer> getEnteros() {
        return enteros;
    }

    public void setEnteros(ArrayList<Integer> enteros) {
        this.enteros = enteros;
    }
}
