package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrToCelTest {
    @Test
    public void testConvertFahr() {
        assertEquals(0, FahrToCel.convertFahr(32), 00000.1);
    }
}