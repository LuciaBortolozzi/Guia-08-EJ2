package controller;
import model.*;
import view.Validaciones;
import view.Mostrar;

import java.util.ArrayList;

public class Controlador {

    ArrayList<Golosinas> golosinas = new ArrayList<Golosinas>();
    ArrayList<Integer> enteros = new ArrayList<Integer>();

    public Controlador(){

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

    public void ingresarGolosinas(){
//        Ingresar por teclado los datos de las golosinas con los que opera la tienda.

        Mostrar.mostrar("Ingreso de golosinas");
        for (Golosinas golosina: golosinas
             ) {

            Mostrar.mostrar("Ingresar codigo: ");
            golosina.setCodigo(Validaciones.validarInt());

            golosina.setDescripcion(Validaciones.ingresar("descripcion: "));

            Mostrar.mostrar("Sabores posibles: acido, agrio, amargo, dulce, salado, picante");
            Mostrar.mostrar("Ingresar cantidad de sabores: ");
            int cant = Validaciones.limite(1, 6);
            ArrayList<String> sabores = new ArrayList<String>(cant);
            for (String sabor: sabores
                 ) {
                sabor = Validaciones.ingresar("sabor: ");
                sabores.add(sabor);
            }
            golosina.setSabores(sabores);

            Mostrar.mostrar("Ingresar precio unitario: ");
            golosina.setPrecioUnitario(Validaciones.validarDouble());

            }

        }
}