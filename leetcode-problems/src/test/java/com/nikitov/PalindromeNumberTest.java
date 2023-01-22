package com.nikitov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    private final PalindromeNumberSolution executor = new PalindromeNumberSolution();

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(executor.isPalindrome(121));
        assertTrue(executor.isPalindrome(11));
        assertTrue(executor.isPalindrome(1));
    }

    @Test
    public void shouldAnswerWithFalse() {
        assertFalse(executor.isPalindrome(1211));
        assertFalse(executor.isPalindrome(12));
        assertFalse(executor.isPalindrome(123));
    }
}