package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * PowerTwoTest
 */
public class PowerTwoTest {

    PowerTwo powerTwo = new PowerTwo();

    @Test
    void shouldBeErro() {
        assertThrows(RuntimeException.class, () -> {
            powerTwo.isPowerOfTwo(0);
        });
        assertThrows(RuntimeException.class, () -> {
            powerTwo.isPowerOfTwo(-1);
        });
    }

    @Test
    void shouldBeTrue25() {
        assertTrue(powerTwo.isPowerOfTwo(25));
    }

    @Test
    void shouldBeTrue16() {
        assertTrue(powerTwo.isPowerOfTwo(16));
    }

    @Test
    void shouldBeTrue81() {
        assertTrue(powerTwo.isPowerOfTwo(81));
    }

    @Test
    void shouldBeFalse40() {
        assertFalse(powerTwo.isPowerOfTwo(40));
    }

    @Test
    void shouldBeFalse3() {
        assertFalse(powerTwo.isPowerOfTwo(3));
    }

    @Test
    void shouldBeFalse11() {
        assertFalse(powerTwo.isPowerOfTwo(11));
    }

    @Test
    void shouldBeFalse14() {
        assertFalse(powerTwo.isPowerOfTwo(14));
    }
}