package org.example;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();

        circulo.setNombre("Mi circulo");
        circulo.mover(12, 34);

        cuadrado.setNombre("Mi cuadrado");
        cuadrado.mover(200, 200);

        System.out.println("Estas son las figuras originales:");
        System.out.println("Circulo: " + circulo.getNombre());
        System.out.println("Cuadrado: " + cuadrado.getNombre());
        System.out.println("Estas son las posiciones originales:");
        circulo.getPosicion();
        cuadrado.getPosicion();
        System.out.println("--------------------");
        Figura figuraCirculo = circulo.clonar();
        Figura figuraCuadrado = cuadrado.clonar();

        figuraCirculo.setNombre("Circulo clonado");
        figuraCuadrado.setNombre("Cuadrado clonado");

        System.out.println("Estas son las figuras clonadas:");
        System.out.println("Circulo: " + figuraCirculo.getNombre());
        System.out.println("Cuadrado: " + figuraCuadrado.getNombre());

        System.out.println("Estas son las posiciones clonadas:");
        figuraCirculo.getPosicion();
        figuraCuadrado.getPosicion();

        System.out.println("--------------------");
        System.out.println("Ahora vamos a modificar las posiciones de las figuras originales:");
        circulo.mover(100, 100);
        cuadrado.mover(300, 300);
        System.out.println("Estas son las posiciones originales:");
        circulo.getPosicion();
        cuadrado.getPosicion();
        System.out.println("Estas son las posiciones clonadas:");
        figuraCirculo.getPosicion();
        figuraCuadrado.getPosicion();

    }

}