package com.hotel;

public class Application {

    public static void main(String[] args) {
        BookingHistory bookingHistory = new BookingHistory();
        Customer customer = new Customer();

        customer.addRoom(new HotelRoom("Deluxe"));
        customer.addRoom(new HotelRoom("Sea View"));

        bookingHistory.saveRoom(customer);
        System.out.println(customer);

        customer.addRoom(new HotelRoom("Sea View"));
        bookingHistory.saveRoom(customer);
        System.out.println(customer);

        bookingHistory.undoRoom(customer);
        System.out.println(customer);

        bookingHistory.undoRoom(customer);
        System.out.println(customer);


    }
}
