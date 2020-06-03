package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Golosinas {

    protected int codigo;
    protected String descripcion;
    protected ArrayList<String> sabores = new ArrayList<String>();
    protected double precioUnitario;

    /*Constructor  alternativo:  recibe  como  primer  parámetro  la  capacidad  inicial  de  la
    colección  de  enteros  y  llena  esas  posiciones  con  valores  generados  al  azar  de  4
    dígitos enteros positivos. Como segundo parámetro, un vector con varios objetos de
    la clase Golosinas y los asigna al ArrayList correspondiente.*/

    public Golosinas(int capacidad, Vector<Golosinas> golosinas){
        Random rand = new Random();

    }

    public Golosinas(int codigo, String descripcion, ArrayList<String> sabores, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.sabores = sabores;
        this.precioUnitario = precioUnitario;
    }

    public Golosinas() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getSabores() {
        return sabores;
    }

    public void setSabores(ArrayList<String> sabores) {
        this.sabores = sabores;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
