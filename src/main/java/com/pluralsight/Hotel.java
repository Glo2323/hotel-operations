package com.pluralsight;

import java.util.Scanner;

public class Hotel {

    private String name;
    private int numberOfSuits;
    private int numberOfRooms;
    private int bookedSuits;
    private int bookedRooms;

    //!Creating my objects
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


    //!Creating a method that allows guest to book a room
    public boolean bookRoom(int roomCount, boolean suit){
        Scanner scanner =new Scanner(System.in);

        //? if statement to see if they want a suit
        if (suit){
            bookedSuits += roomCount;
            //*Checking if they are any rooms available
            if (getAvailableSuits() > 0 && roomCount > 0)
                System.out.println("Room is booked ");
            else {
                System.out.println("No rooms Available");
                bookedSuits -= roomCount;
            }


        }else {
            System.out.println("How can I Help then");
        }
        return suit = true;
    }

    //?Derived getters that get their info from other info
    public int getAvailableRooms(){
        //?Figure out how many rooms are available by  working with booked rooms vs number of rooms

        return numberOfRooms - bookedRooms;

    }

    public int getAvailableSuits(){
        //?Figure out how many rooms are available by  working with booked suits vs number of suit

        return numberOfSuits - bookedSuits;
    }

    //?Creating getters and setters to get the info and set the info
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
