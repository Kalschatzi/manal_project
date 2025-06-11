package com.kalschatzi;

import com.kalschatzi.OOP.Circle;
import com.kalschatzi.OOP.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testShape(){
        Shape shape = new Shape("blue");
        Circle circle = new Circle("green", 5);


        // Test inheritance of colour
        assertEquals("blue", shape.getColour());
        assertEquals("green", circle.getColour());


        // Test method overriding
        assertEquals("Drawing a blue shape", "Drawing a " + shape.getColour() + " shape");
        assertEquals("Drawing a green circle with a 5.0cm radius", "Drawing a " + circle.getColour()+ " circle with a " + circle.getRadius() + "cm radius");

        // Test getArea method in Circle child class
        assertEquals(Math.round(Math.PI * 5 * 5), circle.getArea());

    }
}
