package org.example;

public class PaymentHandler {

    boolean makePayment ( Ticket ticket ) {
        if ( ticket.getVehicle().getType() == VehicleType.TWO_WHEELER ) {
//            Deduct Rs. 30.
        } else {
//            Deduct Rs. 50
        }
        return true;
    }
}
