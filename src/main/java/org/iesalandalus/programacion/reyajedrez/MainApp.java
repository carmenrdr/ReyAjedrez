package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;

public class MainApp {
    public static void main(String[] args) {
    }

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

}
