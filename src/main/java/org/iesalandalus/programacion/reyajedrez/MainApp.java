package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.*;

import javax.naming.OperationNotSupportedException;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;

public class MainApp {

    Rey nuestroRey;

    private void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
        switch (opcion){
            case 1 -> crearReyDefecto();
            case 2 -> crearReyColor();
            case 3 -> mover();
            case 4 -> despedirse();
        }
    }

    private void crearReyDefecto(){
        nuestroRey = new Rey();
    }

    private void crearReyColor(){
        mostrarMenuColor();
        nuestroRey = new Rey(elegirOpcionColor());
    }

    private void mover() throws OperationNotSupportedException {
        mostrarMenuDirecciones();
        nuestroRey.mover(elegirDireccion());
    }

    private void mostrarRey(){
        System.out.println(nuestroRey.toString());
    }

    public static void main(String[] args) throws OperationNotSupportedException {
        MainApp aplicacion = new MainApp();
        int opcion;
        do {
            mostrarMenu();
            opcion = elegirOpcionMenu();
            aplicacion.ejecutarOpcion(opcion);
            aplicacion.mostrarRey();
        } while (opcion != 4);
    }
}
