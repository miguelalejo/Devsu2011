package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * SpiralTest
 */
public class SpiralAnotherTest {
    SpiralAnother spiral = new SpiralAnother();

    @Test
    void shouldBeErrorNotRectagularMatrix() {
        int[][] matrix = new int[2][];
        matrix[0] = new int[] { 1, 2 };
        matrix[1] = new int[] { 1, 2, 3 };
        assertThrows(RuntimeException.class, () -> {
            spiral.createSpirals(matrix);
        });
    }

    @Test
    void shouldBeZero() {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        assertEquals(-3, spiral.createSpirals(matrix));
    }

    @Test
    void shouldBeMOne() {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 5;
        matrix[1][0] = 8;
        matrix[1][1] = 9;
        matrix[1][2] = 2;
        matrix[2][0] = 0;
        matrix[2][1] = 55;
        matrix[2][2] = 24;
        assertEquals(-1, spiral.createSpirals(matrix));
    }

    @Test
    void shouldBe5050() {
        int[][] matrix = new int[4][4];
        matrix[0][0] = 4;
        matrix[0][1] = 2;
        matrix[0][2] = 1;
        matrix[0][3] = 8;
        matrix[1][0] = 3;
        matrix[1][1] = 1;
        matrix[1][2] = 6;
        matrix[1][3] = 4;
        matrix[2][0] = 3;
        matrix[2][1] = 10;
        matrix[2][2] = 7;
        matrix[2][3] = 3;
        matrix[3][0] = 2;
        matrix[3][1] = 2;
        matrix[3][2] = 9;
        matrix[3][3] = 6;
        assertEquals(5050, spiral.createSpirals(matrix));
    }

    @Test
    void shouldBe36() {
        int[][] matrix = new int[2][5];
        matrix[0][0] = 2;
        matrix[0][1] = 8;
        matrix[0][2] = 7;
        matrix[0][3] = 1;
        matrix[0][4] = 4;
        matrix[1][0] = 9;
        matrix[1][1] = 9;
        matrix[1][2] = 8;
        matrix[1][3] = 1;
        matrix[1][4] = 2;
        assertEquals(36, spiral.createSpirals(matrix));
    }

}