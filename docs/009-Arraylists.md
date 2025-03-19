#Arraylists
The ArrayList class is a resizable, dynamic array, which can be found in the `java.util` package and is part of the 
collections framework.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and 
removed from an ArrayList whenever you want.


Syntax of an arraylist:

`ArrayList<Integer> arr = new ArrayList<Integer>();`

Example of how to create an arraylist:
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

```
Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". 
Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify 
an equivalent wrapper class: Integer. For other primitive types, use: 'Boolean' for boolean, 'Character' for char,
'Double' for double, etc:

Basic arraylist operations:

- Adding items to the arraylist - `add()`method
    ```java
    import java.util.ArrayList;
    
    public class Main {
      public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
      }
    }
    ```

- Adding an item at a specific index:
    ```java
    import java.util.ArrayList;
    
    public class Main {
      public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
    
        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
    
        System.out.println(cars);
      }
    }
    ```
- Access an item - get() method takes an index value:
  
    `cars.get(0);`
- Modify an item:

    `cars.set(0, "Opel");`
- Remove an item:

    `cars.remove(0);`
- Remove all items from the Arraylist:
    `cars.clear();`
- Find out the size of the arraylist(how many items it contains):
    `cars.size();`

###Complexity of Java arraylists:

| **Operation** | **Time Complexity** | **Space Complexity** |
| --- | --- | --- |
| Inserting elements | O(1) | O(N) |
| Removing elements | O(N) | O(1) |
| Traversing elements | O(N) | O(N) |
| Replacing elements | O(1) | O(1) |


### Advantages of Java ArrayList

- **Dynamic size:** ArrayList can dynamically grow and shrink in size, making it easy to add or remove elements as needed.
- **Easy to use**: ArrayList is simple to use, making it a popular choice for many Java developers.
- **Fast access**: ArrayList provides fast access to elements, as it is implemented as an array under the hood.
- **Ordered collection**: ArrayList preserves the order of elements, allowing you to access elements in the order they 
  were added.
- **Supports null values**: ArrayList can store null values, making it useful in cases where the absence of a value 
  needs to be represented.

### Disadvantages of Java ArrayList

- **Slower than arrays**: ArrayList is slower than arrays for certain operations, such as inserting elements in the 
  middle of the list.
- **Increased memory usage**: ArrayList requires more memory than arrays, as it needs to maintain its dynamic size and
  handle resizing.
- **Not thread-safe:** ArrayList is not thread-safe, meaning that multiple threads may access and modify the list 
  concurrently, leading to potential race conditions and data corruption.
- **Performance degradation**: ArrayList’s performance may degrade as the number of elements in the list increases, 
  especially for operations such as searching for elements or inserting elements in the middle of the list.


