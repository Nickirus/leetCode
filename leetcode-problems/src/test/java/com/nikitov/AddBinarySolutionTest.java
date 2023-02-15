package com.nikitov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinarySolutionTest {
    private final AddBinarySolution executor = new AddBinarySolution();

    @Test
    public void shouldBeEquals() {
        assertEquals("0", executor.addBinary("0", "0"));
        assertEquals("1", executor.addBinary("1", "0"));
        assertEquals("100", executor.addBinary("11", "1"));
        assertEquals("100", executor.addBinary("1", "11"));
        assertEquals("10101", executor.addBinary("1010", "1011"));
        assertEquals("10010", executor.addBinary("1010", "1000"));
    }
}