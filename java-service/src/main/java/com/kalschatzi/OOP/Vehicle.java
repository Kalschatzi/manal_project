package main.java.com.kalschatzi.OOP;

// Vehicle parent class to demonstrate polymorphism
public abstract class Vehicle {
    private int yearMade;

    public Vehicle(int yearMade) {
        this.yearMade = yearMade;
    }


    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public abstract void move();


}
