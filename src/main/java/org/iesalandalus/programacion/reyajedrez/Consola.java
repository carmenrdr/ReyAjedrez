package org.iesalandalus.programacion.reyajedrez;

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

}
