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

        return Collections.max(getEnteros());
    }

    public void quitarObjeto (Golosinas golosina) throws Excepciones {


        if (getGolosinas().contains(golosina)){
            getGolosinas().remove(golosina);
        } else {
            throw new Excepciones("no existe el objeto");
        }
    }

    public void ordenDescendente(){
        /*devuelve  la  colección  de  objetos  de  la  clase  Golosinas ordenada en forma descendente, según el precio.*/

        Collections.sort(getGolosinas(), new GolosinasByPrecio());

    }

    public void hayRepetidos(){
        /*indica  si  existen  valores  repetidos  en  la  colección  de  objetos Golosinas, según un criterio diferente al punto c*/
    }

    public void igualValores(List <Integer> lista){
        /*indica si la colección recibida como argumento  tiene algún valor en común, respecto a la estructura  existente*/

    }

    public void agregar(List<Golosinas> golosinas){
        /*agrega  la  lista  recibida  como  argumento  al  final  del ArrayList propio.*/
    }

    public void busquedaMultiple(Integer entero){
        /*retorna  la  cantidad  de  veces  que  se  encuentra  un número en la colección. De no existir, lanza la misma excepción del punto c.*/
    }

    public void distintosValores(List <Golosinas> golosinas) {
        /*devuelve un ArrayList con aquellos objetos que no coinciden con los recibidos como argumentos.*/
    }

    public void copiarLista(int pos1, int pos2) {
        /*copiar en una lista nueva las posiciones de la lista de enteros, comprendidas entre los argumentos recibidos.*/
    }

}
