package org.example;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, DistanceUnit> units;

    public Calculator() {
        units = new HashMap<>();
        units.put("mm", DistanceUnit.MM);
        units.put("cm", DistanceUnit.CM);
        units.put("dm", DistanceUnit.DM);
        units.put("m", DistanceUnit.M);
        units.put("km", DistanceUnit.KM);
    }

    public double compute(String expression) {
        String[] terms = expression.split("(?=[-+])|(?<=[-+])"); // Split at + or - while keeping the delimiter
        double result = 0.0;

        for (String term : terms) {
            term = term.trim(); // Remove leading/trailing spaces
            if (!term.isEmpty()) {
                String[] parts = term.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"); // Split number and unit
                if (parts.length == 2 && units.containsKey(parts[1])) {
                    double value = Double.parseDouble(parts[0].trim());
                    result += convertToMillimeters(value, units.get(parts[1]));
                }
            }
        }

        return result;
    }

    protected double convertToMillimeters(double value, DistanceUnit unit) {
        return value * unit.getConversionToMM();
    }
}
