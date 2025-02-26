package main.java.com.kalschatzi.OOP;

// Inheritance example continues
public class Circle extends Shape {
    private double radius;

    public Circle(String colour, double radius) {
        super(colour); // calling the constructor of the parent class
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Overriding the draw method of the parent class
    @Override
    public void draw(){
        System.out.println("Drawing a " + getColour() + " circle with a " + radius + "cm radius");
    }

    public double getArea(){
        return Math.round((Math.PI * radius * radius));
    }




    public static void main(String[] args) {

        Circle myCircle = new Circle("red", 8);
        myCircle.draw();
        System.out.println((myCircle.getArea()) + "cm squared");
    }



}
