package org.example;

public interface Figura {
    public void setNombre(String n);
    public String getNombre();
    public void mover(int x, int y);
    public String getPosicion(); // Cambiado para retornar un String
    public Figura clonar();
}

