package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void isAvailable_should_return_false_if_room_is_dirtAndOccupied() {
        //?arrange
        Room room = new Room(2, "King", true, true);

        //?act
        boolean notAvailable = room.isAvailable();

        //?assert
        assertFalse(notAvailable);


    }

    @Test
    public void isAvailable_should_return_true_if_room_is_notDirtAndOccupied() {
        //?arrange
        Room room = new Room(2, "King", false, false);

        //?act
        boolean isAvailable = room.isAvailable();

        //?assert
        assertTrue(isAvailable);


    }

    @Test
    public void checkIn_should_makeRoom_Occupied(){

        //?arrange
        Room room = new Room(2, "King", false, false);

        //?act
        room.checkIn();

        //?assert
        assertTrue(room.isOccupied());



    }

    @Test
    public void checkIn_should_makeRoom_dirty(){

        //?arrange
        Room room = new Room(2, "King", false, false);

        //?act
        room.checkIn();

        //?assert
        assertTrue(room.isDirty());



    }


    @Test
    public void checkOut_should_makeRoom_NotOccupied(){

        //?arrange
        Room room = new Room(2, "King", true, true);

        //?act
        room.checkOut();

        //?assert
        assertFalse(room.isOccupied());



    }

    @Test
    public void checkOut_should_makeRoom_clean(){

        //?arrange
        Room room = new Room(2, "King", true, true);

        //?act
        room.checkOut();

        //?assert
        assertFalse(room.isDirty());



    }

    @Test
    public void cleanRoom_should_makeRoom_clean(){
        //?arrange
        Room room = new Room(2, "King", true, false);

        //?act
        room.cleanRoom();

        //?assert
        ;
        assertFalse(room.isDirty());

    }

}