package main.java.com.kalschatzi.OOP;
// Car child class to demonstrate polymorphism

public class Car extends Vehicle {
    private String manufacturer;

    public Car(int yearMade, String manufacturer) {
        super(yearMade);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void getInformation(Car car){
        System.out.println("This car was manufactured by " + car.getManufacturer() + " in " + car.getYearMade());
    }

    @Override
    public void move(){
        System.out.println("Car is driving down the road");
    }

    public static void main(String[] args) {
        Car mycar = new Car(2011, "BMW");
        mycar.move();
        mycar.getInformation(mycar);
    }
}
