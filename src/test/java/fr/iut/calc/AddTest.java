package fr.iut.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    @Test
    void testAddNombresPositifs() {
        assertEquals(5, new Add().add(2, 3));
    }

    @Test
    void testAddAvecZero() {
        assertEquals(7, new Add().add(7, 0));
    }

    @Test
    void testAddNombresNegatifs() {
        assertEquals(-8, new Add().add(-3, -5));
    }
}
