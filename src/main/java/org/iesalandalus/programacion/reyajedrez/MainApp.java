package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;

public class MainApp {

    public Rey nuestroRey;

    private void ejecutarOpcion(int eleccion) throws OperationNotSupportedException {
        switch (eleccion){
            case 1 -> crearReyDefecto();
            case 2 -> crearReyColor();
            case 3 -> mover();
            case 4 -> ;
        }
    }

    private void crearReyDefecto(){
        nuestroRey = new Rey();
    }

    private void crearReyColor(){
        elegirOpcionColor();
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
        int eleccion = 0;
        do {
            mostrarMenu();
            elegirOpcionMenu();
            aplicacion.ejecutarOpcion(eleccion);
            aplicacion.mostrarRey();
        } while (eleccion != 4);
    }
}
