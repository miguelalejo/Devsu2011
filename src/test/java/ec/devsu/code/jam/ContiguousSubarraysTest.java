package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * ContiguousSubarraysTest
 */
public class ContiguousSubarraysTest {
    ContiguousSubarrays contiguousSubarrays = new ContiguousSubarrays();

    @Test
    void t1() {
        int[] arr = new int[] { 4, -3, 7, 2, 4, -5, 1, 2 };
        assertEquals(14, contiguousSubarrays.sumMaxSubArray(arr));
    }

    @Test
    void t2() {
        int[] arr = new int[] { 4, -3, 7, 2, 4, -5, 1, 100 };
        assertEquals(110, contiguousSubarrays.sumMaxSubArray(arr));
    }

    @Test
    void t3() {
        int[] arr = new int[] { 1, -3, 7, 2, 4, 2, 1, 100 };
        assertEquals(116, contiguousSubarrays.sumMaxSubArray(arr));
    }
}