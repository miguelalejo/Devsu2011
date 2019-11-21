package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * CharacterFrequencyTest
 */
public class CharacterFrequencyTest {
    CharacterFrequency app = new CharacterFrequency();

    @Test
    public void shouldBevalidTest1() {
        assertEquals("2.1.2.4.2.4.2.1.4.2.4.2", app.translate("safdgdgvdsdf", "."));
    }



}