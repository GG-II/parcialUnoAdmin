package com.mycompany.parcialuno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase AreaTrapecio
 * Autor: Gerbert García
 */

public class FiguraTest {

    /**
     * Prueba unitaria para verificar el area de trapecio correcto
     */
    @Test
    void testAreaTrapecio() {
        AreaTrapecio testeo = new AreaTrapecio();
        assertEquals(56, testeo.areaTrap(10, 6, 7), "El resultado debe ser 56");
    }

    /**
     * Prueba unitaria incorrecta
     */
    @Test
    void testAreaTrapecio2() {
        AreaTrapecio testeo = new AreaTrapecio();
        assertEquals(10, testeo.areaTrap(8, 4, 5), "El resultado debe ser 10");
    }
}
