package org.example.IsHeGonnaSurvive;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Random;
import java.lang.Math;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {

    @Test @DisplayName("A true hero") @Order(1)
    void aTrueHero() {
        assertTrue(Solution.hero(10, 5), "With 10 bullets and 5 dragons");
        assertTrue(Solution.hero(100, 40), "With 100 bullets and 40 dragons");
    }

    @Test @DisplayName("A false hero") @Order(2)
    void aFalseHero() {
        assertFalse(Solution.hero(4, 5), "With 4 bullets and 5 dragons");
        assertFalse(Solution.hero(1500, 751), "With 1500 bullets and 751 dragons");
        assertFalse(Solution.hero(0, 1), "With 0 bullets and 1 dragon");
        assertFalse(Solution.hero(7, 4), "With 7 bullets and 4 dragons");
    }

    @Test @DisplayName("Is he a hero?") @Order(3)
    void isHeAHero() {
        Random random = new Random();
        for (int i =  0; i < 100; i++) {
            int bullets = Math.abs(random.nextInt());
            int dragons = random.nextInt(bullets + 1);
            boolean expected = bullets >= dragons * 2L;
            assertEquals(expected, Solution.hero(bullets, dragons), "With " + bullets + " bullets and " + dragons + " dragons");
        }
    }
}