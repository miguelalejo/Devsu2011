package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * SortingGeeksTest
 */
public class SortingGeeksTest {

    SortingGeeks sortingGeeks = new SortingGeeks();

    @Test
    void t1() {
        assertArrayEquals(new String[] { "a", "b" }, sortingGeeks.sort(new String[] { "b", "a" }));
    }

    @Test
    void t2() {
        assertArrayEquals(new String[] { "a", "b", "c" }, sortingGeeks.sort(new String[] { "c", "b", "a" }));
    }

    @Test
    void t3() {
        assertArrayEquals(new String[] { "aa", "az", "by", "cx" },
                sortingGeeks.sort(new String[] { "cx", "by", "aa", "az" }));
    }

    @Test
    void t4() {
        assertArrayEquals(new String[] { "contest", "more", "programming", "test" },
                sortingGeeks.sort(new String[] { "test", "contest", "programming", "more" }));
    }
}