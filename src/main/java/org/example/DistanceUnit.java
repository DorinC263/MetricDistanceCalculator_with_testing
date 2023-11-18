package org.example;

public enum DistanceUnit {
    MM(1.0),
    CM(10.0),
    DM(100.0),
    M(1000.0),
    KM(1_000_000.0);

    private final double conversionToMM;

    DistanceUnit(double conversionToMM) {
        this.conversionToMM = conversionToMM;
    }

    public double getConversionToMM() {
        return conversionToMM;
    }

}
