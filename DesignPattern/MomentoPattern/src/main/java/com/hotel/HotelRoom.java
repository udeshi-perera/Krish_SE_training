package com.hotel;

public class HotelRoom {

    private String roomType;


    public HotelRoom(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomType='" + roomType + '\'' +
                '}';
    }
}
