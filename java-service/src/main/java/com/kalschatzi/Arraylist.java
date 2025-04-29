package com.kalschatzi;

import java.util.ArrayList;
import java.util.Comparator;

// Shopping list class to implement arraylist data structure
public class Arraylist {


    public static void main(String[] args) {

        ArrayList<String> Shoppinglist = new ArrayList<String>();

        // Adding elements to LinkedList
        Shoppinglist.add("Milk");
        Shoppinglist.add("Bread");
        Shoppinglist.add("Eggs");
        Shoppinglist.add("biscuits");

        // getting an element from the arraylist
        System.out.println(Shoppinglist.get(0));

        // Modifying an item
        Shoppinglist.set(1, "Apples");

        // Removing an item
        Shoppinglist.remove(0);

        // Getting the size of the arraylist
        System.out.println(Shoppinglist.size());

        // Removing all items from arraylist
//        Shoppinglist.clear();

        // Sorting the arraylist elements
        Shoppinglist.sort(Comparator.naturalOrder());
        System.out.println(Shoppinglist);

        // Searching the arraylist for a specific element and returning a boolean
        System.out.println(Shoppinglist.contains("Apples"));

        // Check if arraylist is empty
        System.out.println(Shoppinglist.isEmpty());

        // Search for a specific element and return its index
        System.out.println(Shoppinglist.indexOf("Eggs"));

        // Iterating through an arraylist
        for (String item : Shoppinglist){
            System.out.print(item + ", ");
        }


    }
}



