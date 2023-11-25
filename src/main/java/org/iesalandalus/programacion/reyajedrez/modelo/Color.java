package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Color {
    BLANCO ("Blanco"), NEGRO ("Negro");

    private String cadenaAMostrar;

    private Color(String colores) {
        this.cadenaAMostrar = colores;
        //Le llamo colores para no confundirme con la clase 'Color' y aclararme mejor.
    }
    @Override
    public String toString() {
        return cadenaAMostrar;
    }

}
