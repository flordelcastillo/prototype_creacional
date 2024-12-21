package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class FiguraTest {

    @Test
    public void testSetNombreYGetNombre() {
        Figura figura = new Circulo();
        figura.setNombre("Figura Generica");
        assertEquals("Figura Generica", figura.getNombre());
    }

    @Test
    public void testMoverYGetPosicion() {
        Figura figura = new Cuadrado();
        figura.mover(100, 200);
        assertEquals("X: 100 Y: 200", figura.getPosicion());
    }

    @Test
    public void testClonar() {
        Figura figura = new Circulo();
        figura.setNombre("Figura Original");
        figura.mover(300, 400);

        Figura clon = figura.clonar();

        // Verificar que no es el mismo objeto
        assertNotSame(figura, clon);

        // Verificar que los datos coinciden
        assertEquals(figura.getNombre(), clon.getNombre());
        assertEquals(figura.getPosicion(), clon.getPosicion());
    }
}
