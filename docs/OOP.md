#Object Oriented Programming - OOP

OOP is a programming paradigm that organises code around objects, rather than functions and procedures. Classes are used
as blueprints for creating objects. OOP allows us to model the world around us in a logical and intuitive way.

We can create as many objects from these classes as we want.

Example with pseudocode:
```
Box.java // the box class

Attributes:
int height = 10;
int width = 10; 
int depth= 10;

Methods:
public int getHeight();
public void setHeight();

public int getWidth();
public void setWidth();

public int getDepth();
public void setDepth();

// creating box objects
Box b1 = new Box(5, 5, 5);
Box b2 = new Box(7, 7, 7);
Box b3 = new Box (10, 10, 10);
```

Alternative paradigms to OOP include the following:

- **Functional** - Instead of organising the code around objects, It's organised around functions.
- **Imperative** - Imperative programming consists of sets of detailed instructions that are given to the computer to execute
  in a given order. It's called "imperative" because as programmers we dictate exactly what the computer has to do, in a
  very specific way. Imperative programming focuses on describing how a program operates, step by step.
- **Procedural** - Procedural programming is a derivation of imperative programming, adding to it the feature of functions 
  (also known as "procedures" or "subroutines"). In procedural programming, the user is encouraged to subdivide the 
  program execution into functions, as a way of improving modularity and organisation.

##Encapsulation
in encapsulation, all the data and methods that operate on that data are encapsulated within a class. Eg. all the data 
and methods related to a cat will be in the cat class and all the data and methods related to a dog will be in the dog 
class. In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of 
the class in which they are found and it s important to declare this class private. This concept helps hide an object's 
internal state and only exposes necessary functionalities through methods which ensures better data security and code 
maintainability.

Syntax:
```
<Access_Modifier> class <Class_Name> {

 private <Data_Members>;

 private <Data_Methods>;

}
```

###Advantages of Encapsulation

1. **Data Protection**: Encapsulation restricts direct access to the object’s data, ensuring that it can only be modified 
   through controlled methods, protecting the integrity of the data.
2. **Improved Security**: By hiding the internal implementation, encapsulation enhances security, preventing unauthorised 
   access to sensitive data.
3. **Simplified Maintenance**: Encapsulated code is easier to maintain since changes in internal implementation do not 
   affect other parts of the program.
4. **Increased Flexibility**: You can modify internal components without changing the external API, allowing flexibility in
   improving or updating internal logic.
5. **Code Reusability**: Encapsulation promotes the use of modular code, allowing for the reuse of code in different parts 
   of a program or future projects.
6. **Better Control Over Data**: By using getter and setter methods, you can apply validation and constraints on data, 
   ensuring correctness.
7. **Reduced Complexity**: It hides complex implementation details, making it easier for developers to work with objects 
   without knowing the internal workings.
8. **Prevents Unintended Interactions**: Encapsulation prevents accidental or improper changes to an object’s state by 
   ensuring changes are controlled and intentional.
9. **Enhances Readability**: Encapsulated code is generally more readable and understandable because it provides a clean 
   interface for data interaction.

###Disadvantages of Encapsulation
1. **Increased Code Size**: Encapsulation may require additional methods (getters/setters), which can increase the amount of
   code and potentially make it more verbose.
2. **Slower Performance**: Indirect access to data through methods can introduce slight performance overhead compared to 
   direct access.
3. **More Complex Code Structure**: Encapsulation can sometimes make the code structure more complex, especially in 
   scenarios where simple direct access would suffice.
4. **Overhead of Maintenance**: Managing encapsulated methods (especially with complex validation) requires careful 
   maintenance, which can be more time-consuming.
5. **Restricted Flexibility for Users**: The class user might need more flexibility in accessing data, as only predefined 
   methods are provided, even when direct access could be simpler or more efficient in some cases.


## Inheritance
Inheritance in Java is the method to create a hierarchy between classes by allowing them to inherit and reuse the 
features(fields and methods) of another class. In addition, you can add new fields and methods specific to your child 
class as well. This allows us to minimise redundant code by organising shared attributes in parent (super) classes since
repetitive code is bad practice and **DRY**(don’t repeat yourself) is one of the most important rules in programming.

Child (sub) classes inherit all public (and protected) variables and methods in all parent classes.
Another way to explain inheritance is as an **is-a** relationship. That is, we use inheritance only if there exists an 
is-a relationship between two classes. For example,

- **Car** is a **Vehicle**
- **Orange** is a **Fruit**
- **Surgeon** is a **Doctor**
- **Dog** is an **Animal**

Here, **Car** can inherit from **Vehicle**, **Orange** can inherit from **Fruit**, and so on.

### Why Do We Need Java Inheritance?

- **Code Reusability:** The code written in the Superclass is common to all subclasses. Child classes can directly use 
  the parent class code.
- **Method Overriding: Method Overriding** is achievable only through Inheritance. It is one of the ways by which Java 
  achieves Run Time Polymorphism.
- **Abstraction:** The concept of abstract where we do not have to provide all details, is achieved through inheritance.
  Abstraction only shows the functionality to the user.

The **extends** keyword is used for inheritance in Java. Using the extends keyword indicates this particular class is 
derived from an existing class.

Syntax:
```
class DerivedClass extends BaseClass  
{  
   //methods and fields  
} 
```

### Java Inheritance Types
Below are the different types of inheritance which are supported by Java.

1. **Single Inheritance** - In single inheritance, a sub-class is derived from only one super class. It inherits the 
   properties and behaviour of a single-parent class. Sometimes, it is also known as simple inheritance.
2. **Multilevel Inheritance** - A child class will be inheriting a parent class, while the child class can also act as 
   the parent class for other classes. For example, class A is the parent to class B and class B is the parent to class
   C. In Java, a class cannot directly access the grandparent’s data. So class C cannot access class A’s data.
3. **Hierarchical Inheritance** - In Hierarchical Inheritance, one class serves as a superclass (Parent class) for more
   than one subclass.
4. **Multiple Inheritance** - In Multiple inheritances, one class can have more than one parent class and inherit
   features from all parent classes. Please note that Java does **not** support **multiple inheritances** with
   classes. In Java, we can achieve multiple inheritances only through **Interfaces**.
5. **Hybrid Inheritance** - It is a mix of two or more of the above types of inheritance. Since Java doesn’t support 
   multiple inheritances with classes, hybrid inheritance involving multiple inheritance is also not possible with 
   classes. In Java, we can achieve hybrid inheritance only through **Interfaces** if we want to involve multiple \
   inheritance to implement Hybrid inheritance.

##Polymorphism

polymorphism essentially means ‘many forms’ and is the ability of an object to take on many forms. It occurs when there 
is inheritance, i.e., many classes are related.

We can illustrate this concept using a steering wheel example. No matter what car you’re driving there's a steering wheel.
The steering wheel remains constant but the mechanism behind it for each car type is different. We can also illustrate 
this concept by looking at how an individual can have different relationships with different people. A woman can be a 
mother, a daughter, a sister, and a friend, all at the same time, i.e. she performs different behaviours in different 
situations.

In OOP, we use this concept to make our code easier, more flexible and more intuitive.

You can perform Polymorphism in Java via two different methods:

1. Method Overloading - the process that can create multiple methods of the same name in the same class, and all the 
   methods work in different ways. Method overloading occurs when there is more than one method of the same name in the 
   class.
```
// Method Overloading example
class Shapes {
  public void area() {
    System.out.println("Find area ");
  }
public void area(int r) {
    System.out.println("Circle area = "+3.14*r*r);
  }

public void area(double b, double h) {
    System.out.println("Triangle area="+0.5*b*h);
  }
public void area(int l, int b) {
    System.out.println("Rectangle area="+l*b);
  }
}

class Main {
  public static void main(String[] args) {
    Shapes myShape = new Shapes();  // Create a Shapes object
    
    myShape.area();
    myShape.area(5); // Output = 78.5
    myShape.area(6.0,1.2); // Output = 3.60
    myShape.area(6,2); // Output = 12
  }
}
```
2. Method Overriding - If a class inherits a method from its superclass, then there is a chance to override the method 
   provided that it is not marked final.
```
// Method Overriding example
class Language {
  public void displayInfo() {
    System.out.println("Common English Language");
  }
}

class Java extends Language {
  @Override
  public void displayInfo() {
    System.out.println("Java Programming Language");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Java class
    Java j1 = new Java();
    j1.displayInfo();

    // create an object of Language class
    Language l1 = new Language();
    l1.displayInfo();
  }
}
```

## Interfaces
An **Interface in Java** programming language is defined as an abstract type used to specify the behaviour of a class.
An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.

To declare an interface, use the interface keyword. It is used to provide total abstraction. That means all the methods
in an interface are declared with an empty body and are public and all fields are public, static, and final by default.
A class that implements an interface must implement all the methods declared in the interface. To implement the 
interface, use the implements keyword.

### Relationship Between Class and Interface

A class can extend another class, and similarly, an interface can extend another interface. However, only a class can 
implement an interface, and the reverse (an interface implementing a class) is not allowed.

Although Class and Interface seem the same there are certain differences between Classes and Interface. The major 
differences between a class and an interface are mentioned below:

| **Class**                                                                   | **Interface**                                                                                    |
|-----------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| In class, you can instantiate variables and create an object.               | In an interface, you must initialise variables as they are final but you can’t create an object. |
| A class can contain concrete (with implementation) methods                  | The interface cannot contain concrete (with implementation) methods.                             |
| The access specifiers used with classes are private, protected, and public. | In Interface only one specifier is used- Public.                                                 |




