package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;

import java.util.Scanner;

public class Consola {

    private Consola(){}

    public static void mostrarMenu() {
        System.out.println("Las opciones son las siguientes: \n"+
                "1. Crea un rey por defecto.\n"+
                "2. Crea un rey eligiendo el color.\n"+
                "3. Mover pieza.\n"+
                "4. Salir del juego.");
    }

    public static int elegirOpcionMenu() {
        Scanner opcion = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.print("Elija una opción: ");
            eleccion = opcion.nextInt();
        } while (eleccion < 1 || eleccion > 4);
        return eleccion;
    }

    public static void mostrarMenuColor() {
        System.out.println("Los colores son: \n"+
                "1. Blanco. \n"+
                "2. Negro.");
    }
    public static Color elegirOpcionColor(){
        Scanner opcion = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.print("Elija un color: ");
            eleccion = opcion.nextInt();
        } while (eleccion <1 || eleccion >2);
        System.out.println("El color elegido es: " + Color.values()[eleccion-1] +".");
        //'eleccion' es -1 ya que en la clase Color asignan a Blanco 0 y a Negro 1.
        return Color.values()[eleccion-1];
    }

    public static void mostrarMenuDirecciones(){
        System.out.println("Las opciones de dirección son las siguientes: \n"+
                "1. Norte. \n"+
                "2. Noreste. \n"+
                "3. Este. \n"+
                "4. Sureste. \n"+
                "5. Sur. \n"+
                "6. Suroeste. \n"+
                "7. Oeste. \n"+
                "8. Noroeste. \n"+
                "9. Enroque corto. \n"+
                "10. Enroque largo.");
    }

    public static Direccion elegirDireccion(){
        Scanner opcion = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.print("Elija una dirección: ");
            eleccion = opcion.nextInt();
        } while (eleccion<1 || eleccion>10);
        System.out.println("La direccion elegida es: "+ Direccion.values()[eleccion-1]+".");
        return Direccion.values()[eleccion-1];
    }

    public static void despedirse(){
        System.out.println("¡Hasta luego!");
    }

}
