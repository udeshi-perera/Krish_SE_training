package com.hotel;

public class Application {

    public static void main(String[] args) {
        BookingRecord bookingRecord=new BookingRecord();
        Customer customer=new Customer();

        customer.addRoom(new HotelRoom("Deluxe"));
        customer.addRoom(new HotelRoom("Sea View"));

        bookingRecord.saveRoom(customer);
        System.out.println(customer);

        customer.addRoom(new HotelRoom("Sea View"));
        bookingRecord.saveRoom(customer);
        System.out.println(customer);

        bookingRecord.undoRoom(customer);
        System.out.println(customer);

        bookingRecord.undoRoom(customer);
        System.out.println(customer);


    }
}
