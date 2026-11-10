package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;


    public Reservation(String roomType, int numberOfNights) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double king = 139.00;

        if (roomType.equalsIgnoreCase("King"))
            return  king;
        else if (roomType.equalsIgnoreCase("Double"))
            return  124.00;
     return 124.00;
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

        if (isWeekend()){
            return (price + (price * .10)) * numberOfNights;
        }


        return  price * numberOfNights;
    }

}
