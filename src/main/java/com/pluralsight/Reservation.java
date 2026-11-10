package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private  boolean weekend;
    private  Room room;


    public Reservation(int numberOfNights, boolean weekend  ,Room room) {
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
        this.room = room;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

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
