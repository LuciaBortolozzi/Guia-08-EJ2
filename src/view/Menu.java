package view;

import controller.Controlador;

public class Menu {

    public void menu(){

        do {
            Mostrar.mostrar("MENU");

            Mostrar.mostrar("0. maximoValor(): devuelve el máximo valor almacenado en la colección de enteros.\n");

            Mostrar.mostrar("1. quitarObjeto (Objeto Golosinas): elimina el objeto recibido como parámetro. Si no \n" +
                    "existe, lanza una excepción propia.\n");

            Mostrar.mostrar("2. ordenDescendente():  devuelve  la  colección  de  objetos  de  la  clase  Golosinas  \n" +
                    "ordenada en forma descendente, según el precio.\n");

            Mostrar.mostrar("3. hayRepetidos():  indica  si  existen  valores  repetidos  en  la  colección  de  objetos \n" +
                    "Golosinas, según un criterio diferente al punto c.\n");

            Mostrar.mostrar("4.igualValores(List <Integer>): indica si la colección recibida como argumento  tiene \n" +
                    "algún valor en común, respecto a la estructura  existente.\n");

            Mostrar.mostrar("5. agregar(List  <Golosinas>):  agrega  la  lista  recibida  como  argumento  al  final  del \n" +
                    "ArrayList propio.\n");

            Mostrar.mostrar("6. busquedaMultiple(Integer):  retorna  la  cantidad  de  veces  que  se  encuentra  un \n" +
                    "número en la colección. De no existir, lanza la misma excepción del punto c.\n");

            Mostrar.mostrar("7. distintosValores(List <Golosinas>): devuelve un ArrayList con aquellos objetos que \n" +
                    "no coinciden con los recibidos como argumentos.\n");

            Mostrar.mostrar("8. copiarLista(int pos1, int pos1): copiar en una lista nueva las posiciones de la lista de \n" +
                    "enteros, comprendidas entre los argumentos recibidos.\n");

            Mostrar.mostrar("9. Salir del menu");

            int opcion = Validaciones.limite(0, 9);

            switch (opcion){
                case 0:
                    Controlador.opcion0();
                    break;
                case 1:
                    Controlador.opcion1();
                    break;
                case 2:
                    Controlador.opcion2();
                    break;
                case 3:
                    Controlador.opcion3();
                    break;
                case 4:
                    Controlador.opcion4();
                    break;
                case 5:
                    Controlador.opcion5();
                    break;
                case 6:
                    Controlador.opcion6();
                    break;
                case 7:
                    Controlador.opcion7();
                    break;
                case 8:
                    Controlador.opcion8();
                    break;
                case 9:
                    Controlador.opcionGrabar();
                    System.exit(0);
            }
        } while (true);
    }
}