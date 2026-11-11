package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_makeRoom_dirtyAndOccupied(){

        //?arrange
        Room room = new Room(2, "King", false, false);

        //?act
        room.checkIn();

        //?assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());


    }


    @Test
    public void checkOut_should_makeRoom_cleanAndNotOccupied(){

        //?arrange
        Room room = new Room(2, "King", true, false);

        //?act
        room.checkOut();

        //?assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());


    }

    @Test
    public void cleanRoom_should_makeRoom_clean(){
        //?arrange
        Room room = new Room(2, "King", true, true);

        //?act
        room.cleanRoom();

        //?assert
        ;
        assertFalse(room.isDirty());

    }

}