package com.kalschatzi;

import main.java.com.kalschatzi.OOP.Animal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnimalTest {

    @Test
    public void testAnimalEncapsulation(){
        Animal dog = new Animal("dog", "Buddy", 5);

        //Test getters
        assertEquals("Buddy", dog.getName());
        assertEquals(5, dog.getAge());

        // Test setters
        dog.setName(("Max"));
        dog.setAge(9);
        assertEquals("Max", dog.getName());
        assertEquals(9, dog.getAge());

        // Test display info method
        assertEquals("This animal is a dog called Max and is 9 years old", dog.displayInfo());



    }
}
