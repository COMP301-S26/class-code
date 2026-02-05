package edu.unc.comp301.govaluate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuitarTest {

    @Test
    void play() {
        Playable guitar = new Guitar("Mine", "rosewood", 6);
        String actual = guitar.play();
        String expected = "Strumming the guitar!";
        assertEquals(expected, actual, "Message differs by " + Math.abs(actual.length()-expected.length()) + " characters.");
    }
}