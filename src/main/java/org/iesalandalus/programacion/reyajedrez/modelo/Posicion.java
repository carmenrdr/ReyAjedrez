package org.iesalandalus.programacion.reyajedrez.modelo;

public class Posicion {

    private int fila;
    private char columna;

    public int getFila() {
        return fila;
    }
    private void setFila(int fila) {
        if (fila<1 || fila>8) {
            throw new IllegalArgumentException("El número de fila no es válido.");
        } else {
            this.fila = fila;
        }
    }

    public char getColumna() {
        return columna;
    }
    private void setColumna(char columna) {
        if (columna<'a' || columna>'h') {
            throw new IllegalArgumentException("La letra de columna no es válida.");
        } else {
            this.columna = columna;
        }
    }

}
