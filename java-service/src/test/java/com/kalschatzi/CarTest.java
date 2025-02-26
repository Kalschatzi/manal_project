package test.java.com.kalschatzi;

import main.java.com.kalschatzi.OOP.Car;
import main.java.com.kalschatzi.OOP.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void testCar(){
        Car car = new Car(2012, "BMW");
        // testing getters
        assertEquals(2012, car.getYearMade());
        assertEquals("BMW", car.getManufacturer());
        //testing setters
        car.setManufacturer("Audi");
        assertEquals("Audi", car.getManufacturer());
        car.setYearMade(2016);
        assertEquals(2016, car.getYearMade());
    }

    @Test
    public void testGetInfo(){
        Car mycar = new Car(2020, "Audi");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {

            mycar.getInformation(mycar);

            // Assert
            Assertions.assertEquals("This car was manufactured by Audi in 2020\n", outContent.toString());
        } finally {
            // Reset System.out to its original state
            System.setOut(originalOut);
        }
    }

    @Test
    public void testMove(){
        Car car2 = new Car(2009, "Ford");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            // Act
            car2.move();

            // Assert
            Assertions.assertEquals("Car is driving down the road\n", outContent.toString());
        } finally {
            // Reset System.out to its original state
            System.setOut(originalOut);
        }

    }


}
