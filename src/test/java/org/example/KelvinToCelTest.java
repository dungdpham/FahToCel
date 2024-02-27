package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinToCelTest {
    @Test
    public void testKelvinToCel() {
        assertEquals(-73.15, KelvinToCel.kelvinToCel(200), 0.00001);
    }
}