package model;

import controller.Excepciones;

import java.util.*;

public class Clase1 {

    ArrayList<Golosinas> golosinas = new ArrayList<Golosinas>();
    ArrayList<Integer> enteros = new ArrayList<Integer>();

    /*Como segundo parámetro, un vector con varios objetos de
    la clase Golosinas y los asigna al ArrayList correspondiente.*/

    public Clase1(int capacidad, Golosinas[] golosinas){
        this.enteros = new ArrayList<Integer>(capacidad);

        Random rand = new Random();

        for(int i = 0; i < capacidad; i++){
            this.enteros.add((rand.nextInt(8999) + 1000));
        }

        Collections.addAll(this.golosinas, golosinas);

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

    public int maximoValor(){

        return Collections.max(this.enteros);
    }

    public void quitarObjeto (Golosinas golosina) throws Excepciones {

        boolean esta = false;
        Golosinas g;
        Iterator<Golosinas> iteratorGolosinas = this.golosinas.iterator();
        while (iteratorGolosinas.hasNext()) {
            g = iteratorGolosinas.next();

            if (g.getCodigo() == golosina.getCodigo()){
                esta = true;
                this.golosinas.remove(golosina);

            }
        }
        if (!esta){
            throw new Excepciones("no existe el objeto");
        }
    }

    public void ordenDescendente(){
        /*devuelve  la  colección  de  objetos  de  la  clase  Golosinas ordenada en forma descendente, según el precio.*/

        Collections.sort(this.golosinas, new GolosinasByPrecio());

    }

    public boolean hayRepetidos(){
        /*indica  si  existen  valores  repetidos  en  la  colección  de  objetos Golosinas, según un criterio diferente al punto c*/

        int cant = 0;
        for (Golosinas golosina: this.golosinas
             ) {
            cant = Collections.frequency(this.golosinas, golosina);
            if (cant > 1){
                break;
            }
        }
        return (cant > 1)? true:false;
    }

    public boolean igualValores(List<Integer> lista){
        /*indica si la colección recibida como argumento  tiene algún valor en común, respecto a la estructura  existente*/
        boolean distinto = false;
        try {
            distinto = Collections.disjoint(this.enteros, lista);
        } catch (Exception e){
            e.printStackTrace();
        }
        return distinto;
    }

    public void agregar(List<Golosinas> golosinas){
        /*agrega  la  lista  recibida  como  argumento  al  final  del ArrayList propio.*/

        this.golosinas.addAll(golosinas);
    }

    public int busquedaMultiple(Integer entero){
        /*retorna  la  cantidad  de  veces  que  se  encuentra  un número en la colección. De no existir, lanza la misma excepción del punto c.*/

        int cantidad = 0;
        cantidad = Collections.frequency(this.enteros, entero);
        if (cantidad == 0){
            try {
                throw new Excepciones("no existe el objeto");
            } catch (Excepciones excepciones) {
                excepciones.printStackTrace();
            }
        }
        return cantidad;
    }

    public ArrayList<Golosinas> distintosValores(List<Golosinas> golosinas) {
        /*devuelve un ArrayList con aquellos objetos que no coinciden con los recibidos como argumentos.*/
        ArrayList<Golosinas> golosinasAux = new ArrayList<Golosinas>();

        for (Golosinas g: golosinas
             ) {
            if (!this.golosinas.contains(g)){
                golosinasAux.add(g);
            }
        }

        return golosinasAux;
    }

    public ArrayList<Integer> copiarLista(int pos1, int pos2) {
        /*copiar en una lista nueva las posiciones de la lista de enteros, comprendidas entre los argumentos recibidos.*/
        ArrayList<Integer> enterosAux = new ArrayList<Integer>();
        int i;
        if (pos1 < pos2){
            try {
                for (i = pos1; i < pos2; i++){
                    enterosAux.add(this.enteros.get(i));
                }
            } catch (NullPointerException e){
                e.printStackTrace();
            }
        }

        return enterosAux;
    }

}
