package org.example.AllUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void testBasicExamples() {
        assertFalse(Kata.hasUniqueChars("  nAa"));
        assertTrue(Kata.hasUniqueChars("abcde"));
        assertFalse(Kata.hasUniqueChars("++-"));
        assertTrue(Kata.hasUniqueChars("AaBbc"));
    }

}