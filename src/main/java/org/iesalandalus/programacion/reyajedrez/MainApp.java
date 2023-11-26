package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import static org.iesalandalus.programacion.reyajedrez.Consola.elegirOpcionColor;

public class MainApp {
    public static void main(String[] args) {
    }

    public Rey nuestroRey;

    private void ejecutarOpcion(int eleccion){
        switch (eleccion){
            case 1 -> ;
            case 2 -> ;
            case 3 -> ;
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

}
