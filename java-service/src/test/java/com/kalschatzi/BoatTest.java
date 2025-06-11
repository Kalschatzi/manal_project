package com.kalschatzi;

import com.kalschatzi.OOP.Boat;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class BoatTest {

    @Test
    public void testBoat(){
        Boat myboat = new Boat(2015, "My Boat", 200);
        // testing getters
        assertEquals(2015, myboat.getYearMade());
        assertEquals("My Boat", myboat.getName());
        assertEquals(200, myboat.getLength());

        // testing setters
        myboat.setName("The Queen Mary");
        assertEquals("The Queen Mary", myboat.getName());
        myboat.setLength(310);
        assertEquals(310, myboat.getLength());
        myboat.setYearMade(1930);
        assertEquals(1930, myboat.getYearMade());



    }

    @Test
    // testing getInformation() method
    public void testGetInformation(){
        Boat myboat2 = new Boat(1909, "The Titanic", 269);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {

            myboat2.getInformation(myboat2);

            // Assert
            assertEquals("The boat is called The Titanic, it was made in 1909 and it's 269.0 meters long.\n", outContent.toString());
        } finally {
            // Reset System.out to its original state
            System.setOut(originalOut);
        }
    }
}
