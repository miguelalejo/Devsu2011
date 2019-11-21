package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * ReverseOrderTest
 */
public class ReverseOrderTest {

    ReverseOrder reverseOrder = new ReverseOrder();

    @Test
    void shouldBeCBA() {
        String text = "A B C";
        assertEquals("C B A", reverseOrder.reverse(text));

    }

    @Test
    void shouldBeText() {
        String text = "this is a test";
        assertEquals("test a is this", reverseOrder.reverse(text));

    }
}