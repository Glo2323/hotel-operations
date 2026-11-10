package com.pluralsight;

public class HotelApp {

    public static void main(String[] args) {
        Guest Messie = new Guest("Messie", "Rutayomba", "Idon'tlikethis@gmail.com", "214-333-5656", "123 mad lane");

        Room room = new Room(2, "King", false, false);
        System.out.println("Room price is: " + room.getPrice());
        room.checkIn();
        room.checkOut();
        System.out.println("Is the room available: " + room.isAvailable());
        System.out.println("Is the room occupied: " + room.isOccupied());
        System.out.println("Is the room dirty: " + room.isDirty());

    }

}
