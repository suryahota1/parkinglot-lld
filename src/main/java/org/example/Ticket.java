package org.example;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle vehicle;
    private Slot slot;
    private Entrance entrance;
    private Exit exit;

    public Ticket(LocalDateTime entryTime, Vehicle vehicle, Slot slot, Entrance entrance) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entrance = entrance;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Slot getSlot() {
        return slot;
    }

    public Entrance getEntrance() {
        return entrance;
    }

    public Exit getExit() {
        return exit;
    }

    public void setExit(Exit exit) {
        this.exit = exit;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
