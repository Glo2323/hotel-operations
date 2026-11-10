package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuits;
    private int numberOfRooms;
    private int bookedSuits;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuits, int numberOfRooms) {
        this.name = name;
        this.numberOfSuits = numberOfSuits;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuits, int numberOfRooms, int bookedSuits, int bookedRoom) {
        this.name = name;
        this.numberOfSuits = numberOfSuits;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuits = bookedSuits;
        this.bookedRooms = bookedRoom;
    }


    public boolean bookRoom(int roomCount, boolean suit){



        return false;
    }


    public int getAvailableRooms(){
        //?Figure out how many rooms are available by  working with booked rooms vs number of rooms

        return numberOfRooms - bookedRooms;

    }

    public int getAvailableSuits(){
        //?Figure out how many rooms are available by  working with booked suits vs number of suit

        return numberOfSuits - bookedSuits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSuits() {
        return numberOfSuits;
    }

    public void setNumberOfSuits(int numberOfSuits) {
        this.numberOfSuits = numberOfSuits;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getBookedSuits() {
        return bookedSuits;
    }

    public void setBookedSuits(int bookedSuits) {
        this.bookedSuits = bookedSuits;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms(int bookedRoom) {
        this.bookedRooms = bookedRoom;
    }
}
