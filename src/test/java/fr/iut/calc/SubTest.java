package fr.iut.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubTest {

    @Test
    void testSubResultatPositif() {
        assertEquals(2, new Sub().sub(5, 3));
    }

    @Test
    void testSubResultatNegatif() {
        assertEquals(-4, new Sub().sub(3, 7));
    }

    @Test
    void testSubAvecZero() {
        assertEquals(9, new Sub().sub(9, 0));
    }
}
