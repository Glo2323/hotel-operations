package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private String roomType;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int numberOfBeds, String roomType, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.occupied = occupied;
        this.dirty = dirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        double price = 0;

        if (roomType.equalsIgnoreCase("King"))
            price = 139.00;
        else if (roomType.equalsIgnoreCase("Double"))
              price = 124.00;


        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public void checkIn(){
        occupied = true;
        dirty = true;
    }

    public void checkOut(){
       cleanRoom();

       occupied = false;

    }

    public void cleanRoom(){
        dirty = false;
    }
}
