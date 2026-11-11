package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_storeTime_into_startTime() {
        //?arrange
        Employee demo = new Employee("Danna Partee", "Office Manager", 50, 0, 0, 0);

        //?Act
        demo.punchIn(9);

        //?Assert
        assertEquals(9, demo.getStartTime());

    }

    @Test
    public void punchOut_storeTime_into_endTime() {

        //?arrange
        Employee demo = new Employee("Danna Partee", "Office Manager", 50, 0, 0, 0);

        //?Act
        demo.punchOut(9);

        //?Assert
        assertEquals(9, demo.getEndtime());

    }

}