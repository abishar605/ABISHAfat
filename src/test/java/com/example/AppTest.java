package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
public class AppTest {
    @Test
    public void testPrime() {
        assertTrue(App.isPrime(7));
        assertFalse(App.isPrime(4));
    }
}
