package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EquilibriumTest
 */
public class EquilibriumTest {

    Equilibrium eq = new Equilibrium();

    @Test
    void shoudBeEq() {
        int[] numbers = new int[] { 1, 2, 3, 2, 1 };
        assertEquals(3, eq.findEquilibriumIndex(numbers));
    }

    @Test
    void shoudBeEqt2() {
        int[] numbers = new int[] { 1, 2, 1 };
        assertEquals(2, eq.findEquilibriumIndex(numbers));
    }

    @Test
    void shoudBeEqt3() {
        int[] numbers = new int[] { 1, 1, 1, 1 };
        assertEquals(2, eq.findEquilibriumIndex(numbers));
    }

    @Test
    void shoudBeEqt4() {
        int[] numbers = new int[] { 5, 4, 6, 1, 15, 0, 0 };
        assertEquals(4, eq.findEquilibriumIndex(numbers));
    }

    @Test
    void shoudBeEqt5() {
        int[] numbers = new int[] { -11, 10, 3, 40, 43, 5, -20, 14 };
        assertEquals(4, eq.findEquilibriumIndex(numbers));
    }

    @Test
    void shoudBeEqt6() {
        int[] numbers = new int[] { -11, 10, 3, 40, 15210, 43, 5, -20, 14 };
        assertEquals(5, eq.findEquilibriumIndex(numbers));
    }
}