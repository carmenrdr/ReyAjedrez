package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;
    //La importamos para poder lanzar la excepción cuando se requiera.

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
    private Rey (Color colorR){
        colorRey = colorR;
        if (colorR == Color.BLANCO){
            posicionRey = new Posicion(1, 'e');
        } else {
            posicionRey = new Posicion(8, 'e');
        }
    }
    public void mover(Direccion movimiento) throws OperationNotSupportedException {
        if (movimiento == null) {
            throw new IllegalArgumentException("La dirección no puede ser nula.");
        }
        if (posicionRey.getFila()==1 && (movimiento==Direccion.SUR || movimiento==Direccion.SURESTE || movimiento==Direccion.SUROESTE)) {
            throw new OperationNotSupportedException("Movimiento inválido. La ficha se sale del tablero.");
        }
        if (posicionRey.getFila()==8 && (movimiento==Direccion.NORTE || movimiento=Direccion.NORESTE || movimiento=Direccion.NOROESTE)){
            throw new OperationNotSupportedException("Movimiento inválido. La ficha se sale del tablero.");
        }
        if (posicionRey.getColumna()=='a' && (movimiento==Direccion.OESTE || movimiento==Direccion.NOROESTE || movimiento==Direccion.SUROESTE)){
            throw new OperationNotSupportedException("Movimiento inválido. La ficha se sale del tablero.");
        }
        if (posicionRey.getColumna()=='h' && (movimiento==Direccion.ESTE || movimiento==Direccion.NORESTE || movimiento==Direccion.SURESTE)){
            throw new OperationNotSupportedException("Movimiento inválido. La ficha se sale del tablero.");
        }
        if (totalMovimientos>0 && (movimiento==Direccion.ENROQUE_CORTO || movimiento==Direccion.ENROQUE_LARGO)){
            throw new OperationNotSupportedException("Movimiento inválido. No se puede hacer enroque.");
        }

        switch (movimiento){
            case NORTE -> posicionRey = new Posicion(posicionRey.getFila()+1, posicionRey.getColumna());
            case SUR -> posicionRey = new Posicion(posicionRey.getFila()-1, posicionRey.getColumna());
            case ESTE -> posicionRey = new Posicion(posicionRey.getFila(), (char) (posicionRey.getColumna()+1));
                //Para sumar y restar también en columna, hay que devolver el valor en char tras hacer la cuenta para que se mantenga como letra.
            case OESTE -> posicionRey = new Posicion(posicionRey.getFila(), (char) (posicionRey.getColumna()-1));
            case NORESTE -> posicionRey = new Posicion(posicionRey.getFila()+1, (char) (posicionRey.getColumna()+1));
            case NOROESTE -> posicionRey = new Posicion(posicionRey.getFila()+1, (char) (posicionRey.getColumna()-1));
            case SURESTE -> posicionRey = new Posicion(posicionRey.getFila()-1, (char) (posicionRey.getColumna()+1));
            case SUROESTE -> posicionRey = new Posicion (posicionRey.getFila()-1, (char) (posicionRey.getColumna()-1));
            case ENROQUE_CORTO -> posicionRey = new Posicion (posicionRey.getFila(), (char) (posicionRey.getColumna()+2));
            case ENROQUE_LARGO -> posicionRey = new Posicion(posicionRey.getFila(), (char) (posicionRey.getColumna()-2));
        }

        totalMovimientos = totalMovimientos+1;
    }

}
