package org.example;

import java.util.Scanner;

public class MetricDistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter the expression (e.g., '10 m + 5 km - 3 mm + 2 cm'): ");
        String expression = scanner.nextLine();

        double result = calculator.compute(expression);
        System.out.println("Result: " + String.format("%.2f", result) + " millimeters");
    }
}
