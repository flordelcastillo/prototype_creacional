package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CuadradoTest {

    @Test
    public void testSetNombreYGetNombre() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setNombre("Mi Cuadrado");
        assertEquals("Mi Cuadrado", cuadrado.getNombre());
    }

    @Test
    public void testMoverYGetPosicion() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.mover(50, 60);
        assertEquals("X: 50 Y: 60", cuadrado.getPosicion());
    }

    @Test
    public void testClonar() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setNombre("Cuadrado Original");
        cuadrado.mover(70, 80);

        Figura clon = cuadrado.clonar();

        // Verificar que no es el mismo objeto
        assertNotSame(cuadrado, clon);

        // Verificar que los datos coinciden
        assertEquals(cuadrado.getNombre(), clon.getNombre());
        assertEquals(cuadrado.getPosicion(), clon.getPosicion());
    }
}
