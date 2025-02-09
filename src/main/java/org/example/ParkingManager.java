package org.example;

import java.util.List;
import java.util.Optional;

public abstract class ParkingManager {
    List<Slot> slots;

    public ParkingManager(List<Slot> slots) {
        this.slots = slots;
    }

    Optional<Slot> getAvailableSlot() {
        return slots.stream().filter((Slot slot) -> !slot.isOccupied()).findFirst();
    }
    boolean occupySlot( Slot slot ) {
        slot.occupySlot();
        return true;
    }
    boolean releaseSlot( Slot slot ) {
        slot.freeUpSlot();
        return true;
    };
    boolean addSlot( Slot slot ) {
        return this.slots.add(slot);
    };
    boolean removeSlot( Slot slot) {
        return this.slots.remove(slot);
    }
}
