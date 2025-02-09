package org.example;

public class Slot {
    private String id;
    private boolean occupied;

    public Slot(String id) {
        this.id = id;
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupySlot() {
        occupied = true;
    }

    public void releaseSlot() {
        occupied = false;
    }
}
