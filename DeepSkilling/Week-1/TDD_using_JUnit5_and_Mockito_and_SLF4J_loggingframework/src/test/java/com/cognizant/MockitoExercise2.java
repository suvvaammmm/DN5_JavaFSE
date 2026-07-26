package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MockitoExercise2 {

    @Test
    void testVerifyInteraction() {

        CalculatorService mockService = mock(CalculatorService.class);

        when(mockService.add(10, 20)).thenReturn(30);

        Calculator calculator = new Calculator(mockService);

        calculator.calculate(10, 20);

        verify(mockService).add(10, 20);
    }
}