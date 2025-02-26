package main.java.com.kalschatzi.OOP;
// Shape class demonstrating Inheritance

public class Shape {
    private String colour;

    public Shape (String colour){
        this.colour = colour;
    }

    // Getters and setters
    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void draw(){
        System.out.println("Drawing a " + colour + " shape");
    }

}
