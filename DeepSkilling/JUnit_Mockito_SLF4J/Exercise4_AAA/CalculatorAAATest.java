package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    private int a;
    private int b;

    @Before
    public void setup() {

        System.out.println("Setup");

        a = 10;
        b = 20;
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 30;

        // Act
        int actual = a + b;

        // Assert
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {

        System.out.println("Teardown");

    }
}