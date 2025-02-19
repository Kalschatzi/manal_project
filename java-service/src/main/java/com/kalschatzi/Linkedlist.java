package main.java.com.kalschatzi;


import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args){

        LinkedList<String> schoolSubjects = new LinkedList<>();

        // Adding items to LL
        schoolSubjects.add("English");
        schoolSubjects.add("Maths");
        schoolSubjects.add("Science");
        schoolSubjects.add("Geography");

        // Adding items at a specific index
        schoolSubjects.add(1, "Spanish");

        // Changing an item in the LL
        schoolSubjects.set(3, "Chemistry");

        // Accessing an item via its index
        System.out.println(schoolSubjects.get(0));;

        // Removing an item from the LL
        schoolSubjects.remove(2);

        // Remove all elements from the LL
//        schoolSubjects.clear();

        // Getting the size of the LL
        System.out.println(schoolSubjects.size());

        // Checking if the LL contains a specific item
        schoolSubjects.contains("English");

        // Check the first occurence of an element
        schoolSubjects.indexOf("Maths");

        // Iterate over LL
        Iterator<String> it = schoolSubjects.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");

        }
        System.out.println();

        // Iterating over LL using a for-each loop
        for (String subject: schoolSubjects){
            System.out.print(subject + ", ");
        }
        System.out.println();

        // Check if LL contains a certain element
        System.out.println(schoolSubjects.contains("Spanish"));

        // Return the index of the first occurrence of an element
        System.out.println(schoolSubjects.indexOf("Chemistry"));

        // Return the index of the last occurrence of an element
        System.out.println(schoolSubjects.lastIndexOf("Spanish"));



    }


}
