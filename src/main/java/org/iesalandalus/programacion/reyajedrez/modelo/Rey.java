package org.iesalandalus.programacion.reyajedrez.modelo;

public class Rey {

    private Color colorRey;
    private Posicion posicionRey;
    private int totalMovimientos;

    public Color getColor(){
        return colorRey;
    }
    private void setColor(Color colorR){
        this.colorRey = colorR;
    }

    public Posicion getPosicion(){
        return posicionRey;
    }
    private void setPosicion(Posicion posicionR){
        this.posicionRey = posicionR;
    }
    //Uso colorR y posicionR para distinguir los parámetros de los atributos.

    private Rey (){
        colorRey = Color.BLANCO;
        posicionRey = new Posicion(1, 'e');
    }

}
