package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * AWordsTest
 */
public class AWordsTest {
    AWords aWords = new AWords();

    @Test
    void shouldConut5() {
        String text = "this is a sample text, it has a lot of analysis.";
        assertEquals(5, aWords.findNumberA(text));
    }

    
    @Test
    void shouldConut0() {
        String text = "this is text,";
        assertEquals(0, aWords.findNumberA(text));
    }

    @Test
    void shouldConut0One() {
        String text = "thisitext,";
        assertEquals(0, aWords.findNumberA(text));
    }

    @Test
    void shouldConut1One() {
        String text = "thisitext,cad";
        assertEquals(1, aWords.findNumberA(text));
    }

    @Test
    void shouldCount1One() {
        String text = "athisitext,cad";
        assertEquals(1, aWords.findNumberA(text));
    }

    @Test
    void shouldCount2Two() {
        String text = "athi asitext,cad";
        assertEquals(2, aWords.findNumberA(text));
    }

}