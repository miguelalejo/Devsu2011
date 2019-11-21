package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * SeriesSeedTest
 */
public class SeriesAnotherTest {
    SeriesAnother seriesSeed = new SeriesAnother();

    @Test
    void shouldBeValidSerieSeed60() {
        float[] seriesExpected = new float[] { 60, 30, 20, 15, 12 };
        assertArrayEquals(seriesExpected, seriesSeed.generateSeries(60, 5));
    }

    

    @Test
    void shouldBeValidSerie() {
        assertEquals(20, seriesSeed.findElement(60, 3));
    }

}