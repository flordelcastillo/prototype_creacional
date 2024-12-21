package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

    @Test
    public void testSetNombreYGetNombre() {
        Circulo circulo = new Circulo();
        circulo.setNombre("Mi Circulo");
        assertEquals("Mi Circulo", circulo.getNombre());
    }

    @Test
    public void testMoverYGetPosicion() {
        Circulo circulo = new Circulo();
        circulo.mover(10, 20);
        assertEquals("X: 10 Y: 20", circulo.getPosicion());
    }

    @Test
    public void testClonar() {
        Circulo circulo = new Circulo();
        circulo.setNombre("Circulo Original");
        circulo.mover(30, 40);

        Figura clon = circulo.clonar();

        // Verificar que no es el mismo objeto
        assertNotSame(circulo, clon);

        // Verificar que los datos coinciden
        assertEquals(circulo.getNombre(), clon.getNombre());
        assertEquals(circulo.getPosicion(), clon.getPosicion());
    }
}
