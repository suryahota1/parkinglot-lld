package org.example;

import java.time.LocalDateTime;

public class Exit {
    private int number;
    private PaymentHandler ph;

    public Exit(int number) {
        this.number = number;
        ph = new PaymentHandler();
    }

    void exitVehicle ( Ticket ticket ) {
        // make payment
        ph.makePayment(ticket);

        // release slot
        ticket.getSlot().releaseSlot();

        // update ticket
        ticket.setExit(this);
        ticket.setExitTime(LocalDateTime.now());
    }
}
