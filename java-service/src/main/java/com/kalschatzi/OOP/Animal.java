package main.java.com.kalschatzi.OOP;
// Animal class demonstrating encapsulation
public class Animal {

    // private fields, not directly accessed from outside this class
    private String type;
    private String name;
    private int age;
    // Constructor
    public Animal(String type, String name, int age){
        this.type = type;
        this.name = name;
        this.age = age;

    }

    // Getter & setters
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age > 0){
        this.age = age;
    } else{
            System.out.println("Age must be positive!");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String newType){
        this.type = type;
    }

    // method to display animal information
    public String displayInfo(){
        return "This animal is a " + type + " called " + name + " and is " + age + " years old";
    }


    public static void main(String[] args) {

        Animal cat = new Animal("Cat", "Poppy", 9);

        System.out.println(cat.getName());
        cat.displayInfo();

        cat.setAge((1));
        System.out.println(cat.getAge());

    }


}
