package org.example;

import java.time.LocalDateTime;
import java.util.Optional;

public class Entrance {
    private int number;
    private ParkingManagerFactory factory;

    public Entrance(int number) {
        this.number = number;
        factory = new ParkingManagerFactory();
    }

    private Ticket generateTicket ( Vehicle vehicle, Slot slot ) {
        return new Ticket(
                LocalDateTime.now(),
                vehicle,
                slot,
                this
        );
    }

    public Optional<Ticket> assignSlot ( Vehicle vehicle ) {
        ParkingManager pm = factory.getParkingManager(vehicle);
        Optional<Slot> slotRef = pm.getAvailableSlot();
        if ( !slotRef.isPresent() ) {
            return Optional.empty();
        }
        Slot slot = slotRef.get();
        return Optional.of(this.generateTicket(vehicle, slot));
    }
}
