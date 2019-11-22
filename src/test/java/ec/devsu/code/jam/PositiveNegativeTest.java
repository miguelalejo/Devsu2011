package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * PositiveNegativeTest
 */
public class PositiveNegativeTest {

    PositiveNegative positiveNegative = new PositiveNegative();

    @Test
    void t1() {
        assertArrayEquals(new Integer[] { -2, -1, 1, 2 }, positiveNegative.order(new int[] { 1, -2, 2, -1 }));
    }

    @Test
    void t2() {
        // a[0] = 4;
        
        assertArrayEquals(new Integer[] { -3, -100, -6, 4, 7, 0, 1 },
                positiveNegative.order(new int[] { 4, -3, -100, 7, 0, 1, -6 }));
    }
}