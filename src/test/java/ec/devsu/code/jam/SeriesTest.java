package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Series
 */
public class SeriesTest {
    Series series = new Series();

    // 7, 6, 8, 4, 9, 2, 10, 0, 11, -2,
    @Test
    void shouldGenerateSerie() {
        int[] serieExpected = new int[] { 7, 6, 8, 4, 9, 2, 10, 0, 11, -2 };
        assertArrayEquals(serieExpected, series.generateSerie(serieExpected.length));
    }

    @Test
    void shouldBe15SumNumbersXY() {        
        assertEquals(15, series.sumXYelements(1, 3));
    }

    
    @Test
    void shouldBe11SumNumbersXY() {        
        assertEquals(11, series.sumXYelements(8, 9));
    }

}