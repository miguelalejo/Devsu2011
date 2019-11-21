package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * SeriesSeedTest
 */
public class SeriesSeedTest {
    SeriesSeed seriesSeed = new SeriesSeed();

    @Test
    void shouldBeValidSerieSeed2() {
        int[] seriesExpected = new int[] { 2, 2, 4, 12, 48 };
        assertArrayEquals(seriesExpected, seriesSeed.generateSeries(2, 5));
    }

    @Test
    void shouldBeValidSerieSeed3() {
        int[] seriesExpected = new int[] { 3, 3, 6, 18, 72 };
        assertArrayEquals(seriesExpected, seriesSeed.generateSeries(3, 5));
    }

    @Test
    void shouldBeValidSerie() {
        assertEquals(72, seriesSeed.findElement(3, 4));
    }

}