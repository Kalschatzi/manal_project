package com.kalschatzi.OOP;
// Airplane child class to demonstrate polymorphism

public class Airplane extends Vehicle {
    private String manufacturer;
    private int seats;
    private boolean privatejet;

    public Airplane(int yearMade, String manufacturer, int seats, boolean privatejet) {
        super(yearMade);
        this.manufacturer = manufacturer;
        this.seats = seats;
        this.privatejet = privatejet;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String airline) {
        this.manufacturer = airline;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isPrivatejet() {
        return privatejet;
    }

    public void setPrivatejet(boolean privatejet) {
        this.privatejet = privatejet;
    }

    @Override
    public void move(){
        System.out.println("Airplane is flying in the sky");
    }

    // Method overloading example
    public void move(int altitude){
        System.out.println("Airplane is flying at " + altitude + " feet");
    }






}
