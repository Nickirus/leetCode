package com.nikitov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordSolutionTest {
    private final LengthOfLastWordSolution executor = new LengthOfLastWordSolution();

    @Test
    public void shouldBe4() {
        assertEquals(4, executor.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void shouldBe6() {
        assertEquals(6, executor.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    public void shouldBe5() {
        assertEquals(5, executor.lengthOfLastWord("Hello World"));
    }
}