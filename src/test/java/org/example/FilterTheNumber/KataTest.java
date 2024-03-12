package org.example.FilterTheNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void exampleTests() {
        assertEquals(123, Kata.filterString("123"));
        assertEquals(123, Kata.filterString("a1b2c3"));
        assertEquals(123, Kata.filterString("aa1bb2cc3dd"));
    }
}