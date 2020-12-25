package com.hotel;

import java.util.Stack;

public class BookingHistory {

    Stack<Customer.CustomerMomento> record = new Stack<>();

    public void saveRoom(Customer customer) {
        record.push(customer.saveRoom());
    }

    public void undoRoom(Customer customer) {
        if (!record.isEmpty()) {
            customer.undoAddedRoom(record.pop());
        } else
            System.out.println("No more rooms to remove..!");
    }
}
