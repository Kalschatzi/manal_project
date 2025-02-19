#Linked lists

A linear data structure used to store the elements in contiguous locations is called a Linked List in Java. It has 
addresses and pointers that are used to link the elements, and each element in the linked list consists of two parts, 
namely the data part and the address part. The data part is the value of the element, and the address part consists of 
the pointers and addresses that are used to link the elements. Each element in the list is called a node.

The syntax to define a Linked list in Java is as follows:

`LinkedList <data_type> linkedlistname = new LinkedList();`

Example:
```import java.util.LinkedList;

class Main {
  public static void main(String[] args){

    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);
  }
}

```
Elements in linked lists are not stored in sequence. Instead, they are scattered and connected through links 
(**Prev** and **Next**).

The usage of a linked list allows dynamic insertion and deletion of elements into the linked list. Because of this 
feature, linked lists are preferred over arrays.

How a linked list works:

- A linked list in Java is a dynamic data structure whose size increases as you add the elements and decreases as you 
  remove the elements from the list.
- The elements in the linked list are stored in containers.
- The list holds the link to the first container.
- All the containers have a link to the next container in the list.
- Whenever you add an element to the list using add() operation, a new container is created, and this container is 
  linked to the other containers in the list.

Basic operations of linked lists:

- `add()` - used to add an element (node) at the end of the LinkedList. For example,
    ```
      import java.util.LinkedList;
        
        class Main {
        public static void main(String[] args){
        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();
    
        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);
    
        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);
        }
        }
      
      ```
- `get()` - used to access an element from the LinkedList. For example,
    ```
    import java.util.LinkedList;
    
    class Main {
      public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
    
        // add elements in the linked list
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);
    
        // get the element from the linked list
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);
      }
    }
    ```

- `set()` - used to change elements of the LinkedList. For example,
   
    ```
    import java.util.LinkedList;
    
    class Main {
      public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
    
        // add elements in the linked list
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Java");
        System.out.println("LinkedList: " + languages);
    
        // change elements at index 3
        languages.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languages);
      }
    }
    ```
- `remove()` - removes an element from the LinkedList. For example,
    ```
    import java.util.LinkedList;
    
    class Main {
      public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
    
        // add elements in LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("LinkedList: " + languages);
    
        // remove elements from index 1
        String str = languages.remove(1);
        System.out.println("Removed Element: " + str);
    
        System.out.println("Updated LinkedList: " + languages);
      }
    }
    ```
- `contains()` - checks if the LinkedList contains the element. For example,
    ```import java.util.LinkedList;
    
    public class Main {
      public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("Toyota"));
      }
    }
    ```
- `indexOf()` - returns the index of the first occurrence of the element. For example,
    ```import java.util.LinkedList;
    
    public class Main {
      public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.indexOf("Ford"));
      }
    }
    ```

- `lastIndexOf()` - returns the index of the last occurrence of the element. For example, 
    ```
  import java.util.LinkedList;
    
    public class Main {
      public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.indexOf("Ford"));
        System.out.println(cars.lastIndexOf("Ford"));
      }
    }
    ```

- `clear()` - removes all the elements of the LinkedList. For example, 
    ```
    import java.util.LinkedList;
    
    public class Main {
      public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.clear();
        System.out.println(cars);
      } 
    }
    ```
- `iterator()` - returns an iterator to iterate over LinkedList. For example, 
    ```
    import java.util.LinkedList;
    import java.util.Iterator;
    
    public class Main {
      public static void main(String[] args) {
      
        // Make a collection
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
      
        // Get the iterator
        Iterator<String> it = cars.iterator();
        
        // Loop through a collection
        while(it.hasNext()) {
          System.out.println(it.next());
        }
      }
    }
    ```

There are different types of linked lists:

- **Singly Linked List -** The type of linked list consisting of a sequence of nodes where each node consists of data
  and a link to the next node, that can be traversed from the first node of the list (also called as head) to the last
  node of the list (also called as Tail)  and is unidirectional is called Singly Linked list.

  ![alt text](https://www.simplilearn.com/ice9/free_resources_article_thumb/LinkedListInJava_1.png)
  - Each element in the list is called a node.
  - A node is made of two parts, namely data and pointer.
  - Data is the data stored in node the and the pointer is the next node in the list.
  - The first node in the list is referred to as the head of the list.
  - The last node in the list is the tail, and it points to NULL.

    The syntax to define a node in a singly linked list is as follows:
    ```
    public class SinglyLinkedList 
    {    
    class Node
    {    
    int data;

               Node next;                

               public Node(int data) 
    {   
    this.data = data;    
    this.next = null;    
    }}}
    ```
    When creating a linked list, you must define the head and the tail as follows:
    ```    
    //defining the head and tail of a singly linked list   
    public Node head = null;    
    public Node tail = null;        
    ```
    You can add data into the linked list as follows:
    ```
    //Adding data to the list by calling the insert function  
        newList.insert(10);    
        newList.insert(30);  
     ```
- **Doubly Linked List** - This type of a linked list consists of a sequence of nodes where each node consists of data
  and two pointers, namely the previous pointer pointing to the previous node and the subsequent pointer that points to 
  the next node that is part of the list. This can be traversed from the first node of the list to the last node of the 
  list and vice versa, and this is called Doubly Linked list.

  ![alt text](https://www.simplilearn.com/ice9/free_resources_article_thumb/LinkedListInJava_3.png)
  The syntax to define a node in a doubly linked list is as follows:
  ```
    public class DoublyLinkedList
    {  
    class Node
    {  
    int data;  
    Node previous;  
    Node next;
    
            public Node(int data)
            {  
                this.data = data;  
            }  
        }
    } 
    ```
- **Circular Linked List**  - It is the type of linked list consisting of a sequence of nodes where each node consists 
  of data and a link to the next node and the last node in the list (also called as tail) that points to the first node 
  in the list (also called as head) is called as Circular Linked List.
  ![alt text](https://www.simplilearn.com/ice9/free_resources_article_thumb/LinkedListInJava_5.png)
## **Advantages and Disadvantages of Linked Lists**

### **Advantages of Linked List in Java**

1. Dynamic Size: Linked lists can grow and shrink dynamically, making them more flexible than arrays with a fixed size.
   This flexibility allows efficient memory utilization since memory can be allocated as needed.
2. Efficient Insertions/Deletions: Inserting or deleting elements in a linked list is generally more efficient than in 
   an array, especially when dealing with large datasets. In linked lists, you only need to update the pointers, whereas
   in arrays, you may need to shift elements.
3. No Wasted Space: Since linked lists do not require contiguous memory allocation, they can efficiently use memory, 
   especially when the available memory is fragmented.
4. Implementation of Abstract Data Types: Because of their dynamic nature, linked lists are ideal for implementing data 
   structures such as stacks, queues, and other abstract data types.

### **Disadvantages of Linked List in Java**

1. Memory Overhead: Each node in a linked list requires additional memory for storing the reference (or pointer) to the 
   next node. This overhead can be significant, especially for large lists.
2. No Random Access: Unlike arrays, linked lists do not allow direct access to elements using an index. To access a 
   specific component, you must traverse the list from the beginning, which can be time-consuming.
3. Cache Performance: Linked lists typically have poorer cache performance than arrays because their elements are 
   scattered throughout memory. This can lead to more cache misses and slower access times.
4. Complexity: Implementing and managing linked lists can be more complex than arrays.Operations like insertion, 
   deletion, and traversal require careful management of pointers, which can lead to bugs if not handled correctly.

###Complexity of Java arraylists
| **Operation** | **Time Complexity** | **Space complexity** |
| --- | --- | --- |
| Insertion at beginning | O(1) | O(1) |
| Insertion at end | O(n) | O(1) |
| Insertion at position | O(n) | O(1) |
| Deletion at beginning | O(1) | O(1) |
| Deletion at end | O(n) | O(1) |
| Deletion at position | O(n) | O(1) |
| Searching in linked list | O(n) | O(1) |