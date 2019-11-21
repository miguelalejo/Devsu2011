package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * SpiralTest
 */
public class SpiralTest {
    Spiral spiral = new Spiral();

    @Test
    void shouldBeErrorNotSquareMatrix() {
        String[][] matrix = new String[3][2];
        assertThrows(RuntimeException.class, () -> {
            spiral.createSpirals(matrix);
        });
    }

    @Test
    void shouldBeA() {
        String[][] matrix = new String[1][1];
        matrix[0][0] = "A";        
        assertEquals("A", spiral.createSpirals(matrix));
    }

    @Test
    void shouldBeABC() {
        String[][] matrix = new String[2][2];
        matrix[0][0] = "A";
        matrix[0][1] = "B";
        matrix[1][0] = "D";
        matrix[1][1] = "C";
        assertEquals("ABCD", spiral.createSpirals(matrix));
    }

    @Test
    void shouldBeABCDEFGHI() {
        String[][] matrix = new String[3][3];
        matrix[0][0] = "A";
        matrix[0][1] = "B";
        matrix[0][2] = "C";
        matrix[1][0] = "H";
        matrix[1][1] = "I";
        matrix[1][2] = "D";
        matrix[2][0] = "G";
        matrix[2][1] = "F";
        matrix[2][2] = "E";
        assertEquals("ABCDEFGHI", spiral.createSpirals(matrix));
    }

    @Test
    void shouldBeABCDEFGHIKJLMNOP() {
        String[][] matrix = new String[4][4];
        matrix[0][0] = "A";
        matrix[0][1] = "B";
        matrix[0][2] = "C";
        matrix[0][3] = "D";
        matrix[1][0] = "L";
        matrix[1][1] = "M";
        matrix[1][2] = "N";
        matrix[1][3] = "E";
        matrix[2][0] = "K";
        matrix[2][1] = "P";
        matrix[2][2] = "O";
        matrix[2][3] = "F";
        matrix[3][0] = "J";
        matrix[3][1] = "I";
        matrix[3][2] = "H";
        matrix[3][3] = "G";
        assertEquals("ABCDEFGHIJKLMNOP", spiral.createSpirals(matrix));
    }

    @Test
    void shouldBeABCDEFGHIJKLMNOPQRSTUVWXY() {
        String[][] matrix = new String[5][5];
        matrix[0][0] = "A";
        matrix[0][1] = "B";
        matrix[0][2] = "C";
        matrix[0][3] = "D";
        matrix[0][4] = "E";
        matrix[1][0] = "P";
        matrix[1][1] = "Q";
        matrix[1][2] = "R";
        matrix[1][3] = "S";
        matrix[1][4] = "F";
        matrix[2][0] = "O";
        matrix[2][1] = "X";
        matrix[2][2] = "Y";
        matrix[2][3] = "T";
        matrix[2][4] = "G";
        matrix[3][0] = "N";
        matrix[3][1] = "W";
        matrix[3][2] = "V";
        matrix[3][3] = "U";
        matrix[3][4] = "H";
        matrix[4][0] = "M";
        matrix[4][1] = "L";
        matrix[4][2] = "K";
        matrix[4][3] = "J";
        matrix[4][4] = "I";
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXY", spiral.createSpirals(matrix));
    }

}