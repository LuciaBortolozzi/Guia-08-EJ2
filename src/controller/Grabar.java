package controller;

import view.Mostrar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Grabar {

    public static void grabar(String texto) throws FileNotFoundException {

        File archivo = new File("D:\\IdeaProjects\\Guia-08-EJ2\\src\\resultados.txt");

        PrintStream pantalla = System.out;

        PrintStream ArchEscribir = new PrintStream(archivo);

        System.setOut(ArchEscribir);

        Mostrar.mostrar(texto);

        ArchEscribir.close();

        System.setOut(pantalla);
    }

}
