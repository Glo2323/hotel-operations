package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuits;
    private int numberOfRooms;
    private int bookedSuits;
    private int bookedRoom;

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
        this.bookedRoom = bookedRoom;
    }


    public boolean bookRoom(int roomCount, boolean suit){



        return false;
    }


    public int getAvailableRooms(){
        //?Figure out how many rooms are available by  working with booked rooms vs number of rooms
        return 0;

    }

    public int getAvailableSuits(){
        //?Figure out how many rooms are available by  working with booked suits vs number of suit
        return 0;
    }
}
