package com.cognizant;

public class Calculator {

    private final CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }

    public int calculate(int a, int b) {
        return service.add(a, b);
    }
}