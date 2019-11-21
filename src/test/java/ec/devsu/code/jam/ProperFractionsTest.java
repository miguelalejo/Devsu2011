package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * ProperFractionsTest
 */
public class ProperFractionsTest {
    ProperFractions properFractions = new ProperFractions();

    @Test
    void shouldBeGcdOne() {
        assertEquals(1, properFractions.gcd(7, 1));
    }

}