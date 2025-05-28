package com.kalschatzi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArraylistTest {


    @Test
    public void confirmArraylistSize() {
        ArrayList<String> myShoppingList = new ArrayList<>();
        // Assuming initial size when the arraylist is first created is 0
        assertEquals(0, myShoppingList.size());
        // adding 1 item to arraylist
        myShoppingList.add("Milk");
        assertEquals(1, myShoppingList.size());
    }
}




