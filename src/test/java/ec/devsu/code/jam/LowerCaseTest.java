package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * LowerCaseTest
 */

public class LowerCaseTest {
    private static final Logger LOG = LogManager.getLogger();
    LowerCase lowerCase = new LowerCase();

    @Test
    void shouldBeValid() {
        String textUpper = "AZÁÉÍÓÚÑ";
        String textLower = "azáéíóúñ";
        for (int i = 0; i < textUpper.length(); i++) {
            int up = textUpper.charAt(i);
            int low = textLower.charAt(i);
            LOG.info(up);
            LOG.info(low);
        }
    }

    @Test
    void shouldBeValidConversionMainLetters() {
        String textUpper = "AZÁÉÍÓÚÑ";
        String textLower = "azáéíóúñ";
        assertEquals(textLower, lowerCase.convertToLowerCase(textUpper));
    }

    @Test
    void shouldBeValidConversion() {
        String textUpper = "Ñañito, QUÉ bien! THIS is a sample text, Lorem Ipsum, 2 Be Converted.";
        String textLower = "ñañito, qué bien! this is a sample text, lorem ipsum, 2 be converted.";
        assertEquals(textLower, lowerCase.convertToLowerCase(textUpper));
    }
}