package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

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

    public Posicion (int fila, char columna) {
        this.setFila(fila);
        this.setColumna(columna);
    }

    public Posicion (Posicion otraPosicion) {
        this.fila = otraPosicion.getFila();
        this.columna = otraPosicion.getColumna();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Posicion posicion)) return false;
        return getFila()==posicion.getFila() && getColumna()==posicion.getColumna();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFila(), getColumna());
    }
    //Me obliga a ponerlo public. También he tenido que importar java.util.Objects.

    @Override
    public String toString(){
        return "fila "+fila+", columna "+columna;
    }

}
