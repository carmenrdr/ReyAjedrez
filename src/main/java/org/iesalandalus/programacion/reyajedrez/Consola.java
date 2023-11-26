package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;

import java.util.Scanner;

public class Consola {

    private Consola(){}

    public static void mostrarMenu() {
        System.out.println("Las opciones son las siguientes: \n" +
                "1. Crea un rey por defecto.\n" +
                "2. Crea un rey eligiendo el color.\n" +
                "3. Mover pieza.\n" +
                "4. Salir del juego.");
    }

    public static void elegirOpcionMenu() {
        Scanner opcion = new Scanner(System.in);
        int eleccion;
        do {
            System.out.print("Elija una opción: ");
            eleccion = opcion.nextInt();
        } while (eleccion < 1 || eleccion > 4);
        System.out.println("La opción elegida es: " + eleccion + ".");
    }

    public static void elegirOpcionColor() {
        System.out.println ("Los colores son: \n" +
                "1. Blanco. \n" +
                "2. Negro.");

        Scanner opcion = new Scanner(System.in);
        int eleccion;
        do {
            System.out.print("Elija un color: ");
            eleccion = opcion.nextInt();
        } while (eleccion <1 || eleccion >2);
        System.out.println("El color elegido es: " + Color.values()[eleccion-1] +"."); //'eleccion' es -1 ya que en la clase Color asignan a Blanco 0 y a Negro 1.
    }

}
