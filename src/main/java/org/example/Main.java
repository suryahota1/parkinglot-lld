package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Entrance> entryGates = new ArrayList<>();
        entryGates.add(new Entrance(1));
        entryGates.add(new Entrance(2));

        List<Exit> exitGates = new ArrayList<>();
        exitGates.add(new Exit(1));
        exitGates.add(new Exit(2));

        Optional<Ticket> ticket = entryGates.get(1).assignSlot(new Vehicle("123", VehicleType.FOUR_WHEELER));
        if ( !ticket.isPresent() ) {
            System.out.println("Parking is full");
        }

        Optional<Ticket> ticket1 = entryGates.get(0).assignSlot(new Vehicle("124", VehicleType.TWO_WHEELER));
        if ( !ticket1.isPresent() ) {
            System.out.println("Parking is full");
        }


    }
}