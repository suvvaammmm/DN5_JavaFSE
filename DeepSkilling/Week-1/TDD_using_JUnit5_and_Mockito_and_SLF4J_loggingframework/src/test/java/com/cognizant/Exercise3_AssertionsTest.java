package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise3_AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(10, 5 + 5);

        assertTrue(20 > 10);

        assertFalse(5 > 10);

        assertNotNull("Cognizant");

        assertNull(null);

    }
}