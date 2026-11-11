package com.pluralsight;

import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //?Creating my guest
        Guest Messie = new Guest("Messie", "Rutayomba", "Idon'tlikethis@gmail.com", "214-333-5656", "123 mad lane");

        //?Creating my Room
        Room room = new Room(2, "King", false, false);

        //*Testing my room
        System.out.println("Room price is: " + room.getPrice());
        room.checkIn();
        room.checkOut();
        System.out.println("Is the room available: " + room.isAvailable());
        System.out.println("Is the room occupied: " + room.isOccupied());
        System.out.println("Is the room dirty: " + room.isDirty());

        //?Creating my employee
        Employee demo = new Employee("Danna Partee", "Office Manager", 50, 0, 0, 0);

        //*Testing my employee

//        System.out.printf("PunchIn: %.02f\nPunchOut: %.02f\nHoursWorked: %.02f"
//                ,demo.punchIn(8), demo.punchOut(15),demo.getHoursWorked());

//        System.out.println("What's your punch in time: ");
//        int  startTime = scanner.nextInt();
//          demo.setStartTime(startTime);

//
//
//
//        System.out.println("What's your Punch out time");
//         int endTime = scanner.nextInt();
//         demo.setEndtime(endTime);


        //?Overloaded Punch in and Punch Out
//        demo.punchIn();
//        demo.punchOut();
//
//
//
//
//        System.out.println(demo.punchTimeCard());


        //? Creating my hotel
        Hotel roomsAndSuits = new Hotel("Manga Art Hotel",5,5);

        Hotel all = new Hotel("Manga Air Hotel", 10, 15, 3, 5);




        //*Testing my hotel
        System.out.println( "How many rooms are available: " + all.getAvailableRooms() + "\n");
        System.out.println("How many Suits are available: " + all.getAvailableSuits() + "\n");


        all.bookRoom(-6,true);


        System.out.println( "How many rooms are available: " + all.getAvailableRooms() + "\n");
        System.out.println("How many Suits are available: " + all.getAvailableSuits() + "\n");



    }
}
