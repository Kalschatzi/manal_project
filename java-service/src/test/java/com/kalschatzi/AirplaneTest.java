package test.java.com.kalschatzi;

import main.java.com.kalschatzi.OOP.Airplane;
import main.java.com.kalschatzi.OOP.Vehicle;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class AirplaneTest {

    @Test
    public void testAirplane(){
        Airplane airplane = new Airplane(2020, "Boeing", 300, false);
        assertEquals(2020, airplane.getYearMade());
        assertEquals(300, airplane.getSeats());
        assertEquals(false, airplane.isPrivatejet());
        assertEquals("Boeing", airplane.getManufacturer());

    }

    @Test
    public void testSetManufacturer(){
        Airplane airplane = new Airplane(2020, "Boeing", 300, false);
        airplane.setManufacturer("Airbus");
        assertEquals("Airbus", airplane.getManufacturer());
    }

    @Test
    public void testMove(){
        Airplane airplane = new Airplane(2020, "Boeing", 300, false);

        // Redirecting System.out to a ByteArrayOutputStream which captures any data sent to System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            // Act
            airplane.move();

            // Assert
            assertEquals("Airplane is flying in the sky\n", outContent.toString());
        } finally {
            // Reset System.out to its original state
            System.setOut(originalOut);
        }

        // Testing move(int altitude) method
        ByteArrayOutputStream outContent2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent2));


        airplane.move(30000);

        // Assert
        assertEquals("Airplane is flying at 30000 feet\n", outContent2.toString());

        // Reset System.out to its original state
        System.setOut(System.out);
    }
}
