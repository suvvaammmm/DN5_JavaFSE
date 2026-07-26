package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoExercise1 {

    @Test
    void testMockingAndStubbing() {

        CalculatorService mockService = mock(CalculatorService.class);

        when(mockService.add(10, 20)).thenReturn(30);

        Calculator calculator = new Calculator(mockService);

        int result = calculator.calculate(10, 20);

        assertEquals(30, result);
    }
}