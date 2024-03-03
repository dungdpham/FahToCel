package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelToFahrTest {
    @Test
    public void testKelToFahr() {
        double test = Math.round(KelToFahr.kelToFahr((float) 300.1));
        assertEquals(59.0, test, 0.00001);
    }
}