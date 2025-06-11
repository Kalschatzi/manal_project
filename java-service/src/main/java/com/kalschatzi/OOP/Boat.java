package com.kalschatzi.OOP;
// Boat child class to demonstrate polymorphism

public class Boat extends Vehicle{
    private String name;
    private float length;

    public Boat(int yearMade, String name, float length) {
        super(yearMade);
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void getInformation(Boat boat){
        System.out.println("The boat is called " + boat.getName() + ", it was made in " + boat.getYearMade() + " and it's "
                + boat.getLength() + " meters long.");
    }

    @Override
    public void move(){
        System.out.println(getName() + " is sailing on the water");
    }

    public static void main(String[] args) {
        Boat myboat = new Boat(1909, "The Titanic", 300);
        myboat.move();
        myboat.getInformation(myboat);
    }
}
