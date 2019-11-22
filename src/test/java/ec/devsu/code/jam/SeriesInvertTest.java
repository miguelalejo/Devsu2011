package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * SeriesInvertTest
 */
public class SeriesInvertTest {
    SeriesInvert seriesInvert = new SeriesInvert();

    @Test
    void t1() {
        assertEquals(53, seriesInvert.generate(5, 3, 1));
    }

    @Test
    void t2() {
        assertEquals(35, seriesInvert.generate(5, 3, 2));
    }

    @Test
    void t3() {
        assertEquals(64, seriesInvert.generate(5, 3, 3));
    }

    @Test
    void t4() {
        assertEquals(1210, seriesInvert.generate(5, 3, 15));
    }

    @Test
    void t5() {
        assertEquals(911, seriesInvert.generate(5, 3, 14));
    }

    @Test
    void t6() {
        assertEquals(79, seriesInvert.generate(5, 3, 10));
    }

    @Test
    void t7() {
        assertEquals(1618, seriesInvert.generate(10, 12, 13));
    }

}