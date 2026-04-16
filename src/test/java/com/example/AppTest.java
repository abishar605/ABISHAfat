package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AppTest {
    @Test
    public void testPrime() {
        assertTrue(App.isPrime(7));
        assertTrue(App.isPrime(11));
        assertFalse(App.isPrime(4));
        assertFalse(App.isPrime(1));
    }
}
