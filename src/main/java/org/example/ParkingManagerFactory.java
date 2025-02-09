package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingManagerFactory {

    private List<Slot> twoWheelerSlots = Arrays.asList(new Slot("23"), new Slot("24"), new Slot("25"));
    private List<Slot> fourWheelerSlots = Arrays.asList(new Slot("43"), new Slot("44"), new Slot("45"));

    private ParkingManager twoWheeler = new TwoWheelerParkingManager(twoWheelerSlots);
    private ParkingManager fourWheeler = new TwoWheelerParkingManager(fourWheelerSlots);

    public ParkingManager getParkingManager ( Vehicle vehicle ) {
        if ( vehicle.getType() == VehicleType.TWO_WHEELER ) {
            return twoWheeler;
        } else {
            return fourWheeler;
        }
    }
}
