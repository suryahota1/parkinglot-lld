package org.example;

public class Vehicle {
    private String number;
    private VehicleType type;

    public Vehicle ( String number, VehicleType type ) {
        this.number = number;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }
}
