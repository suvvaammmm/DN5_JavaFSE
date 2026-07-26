package com.cognizant;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise4_AAATest {

    private int number;

    @BeforeEach
    void setUp() {
        number = 10;
        System.out.println("Setup completed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown completed");
    }

    @Test
    void testAddition() {

        // Arrange
        int value = number;

        // Act
        int result = value + 5;

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testMultiplication() {

        // Arrange
        int value = number;

        // Act
        int result = value * 2;

        // Assert
        assertEquals(20, result);
    }
}