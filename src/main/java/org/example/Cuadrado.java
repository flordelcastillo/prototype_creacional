package org.example;

public class Cuadrado implements Figura{
    private String nombre;
    private int posicionX, posicionY;

    public Cuadrado(){}
    @Override
    public void setNombre(String n){
        this.nombre = n;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
    @Override
    public void mover(int x, int y){
        this.posicionX = x;
        this.posicionY = y;
    }
    @Override
    public String getPosicion() {
        return "X: " + this.posicionX + " Y: " + this.posicionY;
    }

    @Override
    public Figura clonar(){
        Figura figura = new Cuadrado();
        figura.setNombre(this.nombre);
        figura.mover(this.posicionX, this.posicionY);
        return figura;
    }
}
