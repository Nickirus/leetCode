package com.nikitov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneSolutionTest {
    private final PlusOneSolution executor = new PlusOneSolution();

    @Test
    public void threeDigitNumberTest() {
        assertArrayEquals(new int[]{1, 2, 4}, executor.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void ninePlusOneTest() {
        assertArrayEquals(new int[]{1, 0}, executor.plusOne(new int[]{9}));
    }

    @Test
    public void BigValueTest() {
        assertArrayEquals(new int[]{1, 2, 5, 4, 5, 6, 4, 7, 8, 9, 9, 5, 4, 1, 2, 3, 2, 1, 4, 5, 6, 9, 8, 7, 4, 5, 6, 2, 4, 5, 7, 8, 9, 5, 6},
                executor.plusOne(new int[]{1, 2, 5, 4, 5, 6, 4, 7, 8, 9, 9, 5, 4, 1, 2, 3, 2, 1, 4, 5, 6, 9, 8, 7, 4, 5, 6, 2, 4, 5, 7, 8, 9, 5, 5}));
    }
}