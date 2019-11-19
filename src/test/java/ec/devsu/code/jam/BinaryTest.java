package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * BinaryTest
 */
public class BinaryTest {

    Binary binary = new Binary();

    @Test
    void shouldBeCero() {
        assertEquals(0, binary.numberOnesBinary(0));
    }

    @Test
    void shouldBeOne() {
        assertEquals(1, binary.numberOnesBinary(1));
    }

    @Test
    void shouldBeOneNumberTwo() {
        assertEquals(1, binary.numberOnesBinary(2));
    }

    @Test
    void shouldBeTwoOnesNumberThree() {
        assertEquals(2, binary.numberOnesBinary(3));
    }

    @Test
    void shouldBeOneOnesNumberEight() {
        assertEquals(1, binary.numberOnesBinary(8));
    }

    @Test
    void shouldBeTwoOnesNumberSeven() {
        assertEquals(3, binary.numberOnesBinary(7));
    }

    // 10101110110000101100
    @Test
    void shouldBeValid(){
        // 1111111111
        assertEquals(10, binary.numberOnesBinary(715820));
        
    }
}