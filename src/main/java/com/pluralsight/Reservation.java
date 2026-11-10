package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservation {

    //?Attributes to make my object
    private String roomType;
    private double price;
    private int numberOfNights;
    private  boolean weekend;
    private  Room room;


    //!Creating my object
    public Reservation(int numberOfNights, boolean weekend  ,Room room) {
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
        this.room = room;
    }

    //?Creating getters and setters to get the info and set the info
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    //?Derived getters that get their info from other info
    public double getPrice() {
      price =+ room.getPrice();

      if (isWeekend()){
          price = price * 1.10;
      }

      return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        LocalDate date =  LocalDate.now();

        return date.getDayOfWeek() == DayOfWeek.SATURDAY
                || date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    public void setWeekend(boolean weekend) {
    }

    public double getReservationTotal() {

        return  price * numberOfNights;
    }

}
