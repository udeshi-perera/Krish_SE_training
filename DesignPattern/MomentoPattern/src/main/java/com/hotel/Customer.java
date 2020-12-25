package com.hotel;

import java.util.ArrayList;

public class Customer {

    ArrayList<HotelRoom> hotelRoom = new ArrayList<HotelRoom>();

    public void addRoom(HotelRoom room) {
        hotelRoom.add(room);
    }

    public ArrayList<HotelRoom> getHotelRoom() {
        return (ArrayList<HotelRoom>) hotelRoom.clone();
    }

    public CustomerMomento saveRoom() {
        return new CustomerMomento(getHotelRoom());
    }

    public void undoAddedRoom(CustomerMomento customerMomento) {
        hotelRoom = customerMomento.getHotelRoom();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "hotelRoom=" + hotelRoom +
                '}';
    }

    static class CustomerMomento {
        ArrayList<HotelRoom> hotelRoom;

        public CustomerMomento(ArrayList<HotelRoom> hotelRoom) {
            this.hotelRoom = hotelRoom;
        }

        private ArrayList<HotelRoom> getHotelRoom() {
            return hotelRoom;
        }
    }
}
