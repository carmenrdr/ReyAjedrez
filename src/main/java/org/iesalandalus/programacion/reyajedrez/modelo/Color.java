package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Color {
    BLANCO ("Blanco");
    NEGRO ("Negro");

    private String cadenaAMostrar;

    private Color(String colores) {
        this.cadenaAMostrar = colores;
    }

}
