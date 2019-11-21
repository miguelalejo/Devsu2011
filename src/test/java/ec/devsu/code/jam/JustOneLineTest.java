package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * JustOneLineTest
 */
public class JustOneLineTest {

    JustOneLine justOneLine = new JustOneLine();

    @Test
    void shouldBeRemovedDuplicates() {
        int[] numbers = new int[] { 2, 2 };
        assertArrayEquals(new Integer[] { 2 }, justOneLine.removeDuplicates(numbers));
    }

    @Test
    void shouldBeRemovedDuplicatesMultiple() {
        int[] numbers = new int[] { 2, 3, 2, 4, 5, 3, 2, 1 };
        assertArrayEquals(new Integer[] { 2, 3, 4, 5, 1 }, justOneLine.removeDuplicates(numbers));
    }
}