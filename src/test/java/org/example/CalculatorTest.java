package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testComputeWithValidInput() {
        double result = calculator.compute("44m + 66cm");
        System.out.println("Result: " + result);
    }

    @Test
    public void testComputeWithNegativeValues() {
        double result = calculator.compute("-44m - 66cm");
        System.out.println("Result: " + result);
    }

    @Test
    public void testComputeWithMixedUnits() {
        double result = calculator.compute("44m + 66dm + 66mm - 10cm - 0.5km");
        System.out.println("Result: " + result);
    }

    @Test
    public void testComputeWithInvalidInput() {
        try {
            double result = calculator.compute("44m + 66km - 44mm");
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    @Test
    public void testComputeWithMissingOrInvalidInput() {
        try {
            double result = calculator.compute("44m + 66cm - 55cm");
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    @Test
    public void testComputeWithMultipleUnits() {
        double result = calculator.compute("44m + 66cm - 55cm + 65mm");
        System.out.println("Result: " + result);
    }
}