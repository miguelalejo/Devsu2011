package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * CounterTest
 */
public class CounterTest {

    Counter counter = new Counter();

    @Test
    void shouldBeCero() {
        assertEquals(0, counter.findRepeated(new int[] {}));
    }

    @Test
    void shouldBeOneEm() {
        assertEquals(1, counter.findRepeated(new int[] { 1 }));
    }

    @Test
    void shouldBeOneA3() {
        assertEquals(1, counter.findRepeated(new int[] { 2, 1, 1 }));
    }

    @Test
    void shouldBet4() {
        assertEquals(2, counter.findRepeated(new int[] { 2, 1, 2 }));
    }

    @Test
    void shouldBet5() {
        assertEquals(1, counter.findRepeated(new int[] { 2, 1, 2, 1 }));
    }

    @Test
    void shouldBet6() {
        assertEquals(5, counter.findRepeated(new int[] { 1, 5, 3, -2, 4, 2, 4, -2, 5, 5, 2, 1, 3 }));
    }
}