package org.iesalandalus.programacion.reyajedrez;

public class Consola {

    private Consola(){}

    public static void mostrarMenu() {
        System.out.print("Las opciones son las siguientes; \n" +
                "1. Crea un rey por defecto.\n" +
                "2. Crea un rey eligiendo el color.\n" +
                "3. Mover pieza.\n" +
                "4. Salir del juego.");
    }

}
