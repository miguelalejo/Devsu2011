package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * BubbleSortTest
 */
public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test 
    void shouldBeOrdered() {
        int[] numbers = new int[] { 4, 5, 2, 6, 8, 7 };
        assertArrayEquals(new int[] { 2, 4, 5, 6, 7, 8 }, bubbleSort.order(numbers));

    }

}